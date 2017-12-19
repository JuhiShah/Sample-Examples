package com.rootPackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rootPackage.dao.MainDao;


@Service
public class MainServiceImpl<T> implements MainService<T> {

	@SuppressWarnings("rawtypes")
	@Autowired
	private MainDao mainDao;

	@SuppressWarnings("unchecked")
	@Override
	public void add(Object domain) {
		mainDao.add(domain);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update(Object domain) {
		
		System.out.println("update Service ::"+domain);
		mainDao.update(domain);
		
	}

	@Override
	public void delete(Object obj) {
		mainDao.delete(obj);
	}

	@Override
	public List getAllData(String getData) {
		return mainDao.getAllData(getData);
	}
}