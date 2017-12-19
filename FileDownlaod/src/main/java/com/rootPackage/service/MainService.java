package com.rootPackage.service;

import java.util.List;

public interface MainService<T> {


	public void add(T domain);

	public void update(T domain);

	public void delete(T sObj);

	public List<T> getAllData(String getData);
	

}
