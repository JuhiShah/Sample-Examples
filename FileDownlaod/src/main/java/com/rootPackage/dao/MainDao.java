package com.rootPackage.dao;

import java.util.List;

public interface MainDao<T> {


	public void add(T domain);

	public void update(T domain);

	public <T> void delete(T obj);

	public List<T> getAllData(String getData);

}
