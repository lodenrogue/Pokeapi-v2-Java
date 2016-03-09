package com.lodenrogue.pokeapiv2.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractFacade<T> {
	private Class<T> entityClass;
	private ObjectMapper mapper;

	public AbstractFacade(Class<T> entityClass) {
		this.entityClass = entityClass;
		mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	/**
	 * Find entity by an identifier.
	 * 
	 * @param id
	 * @return
	 */
	public T find(Serializable id) {
		try {
			T t = find(new URL(getAddress() + "/" + id));
			return t;
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	protected abstract String getAddress();

	private T find(URL url) {
		try {
			if (url != null) {
				URLConnection conn = url.openConnection();
				conn.setRequestProperty("User-Agent", "Mozilla/5.0");
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

				T t = mapper.readValue(in, entityClass);
				in.close();
				return t;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
