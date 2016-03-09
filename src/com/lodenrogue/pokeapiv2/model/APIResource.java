package com.lodenrogue.pokeapiv2.model;

public class APIResource<T> {
	private Class<T> entityClass;
	private String url;

	public APIResource(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Class<T> getEntityClass() {
		return entityClass;
	}

}
