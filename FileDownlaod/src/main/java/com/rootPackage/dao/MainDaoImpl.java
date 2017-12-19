package com.rootPackage.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDaoImpl<T> implements MainDao<T> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void add(Object domain) {
		sessionFactory.getCurrentSession().save(domain);
	}

	@Override
	@Transactional
	public void update(Object domain) {

		System.out.println("update dao domain ::"+domain);
		
		sessionFactory.getCurrentSession().merge(domain);
		
	}

	@Override
	@Transactional
	public List getAllData(String getData) {
		return sessionFactory.getCurrentSession().createQuery(getData).list();
	}

	@Override
	@Transactional
	public void delete(Object obj) {
		sessionFactory.getCurrentSession().delete(obj);
	}

}
