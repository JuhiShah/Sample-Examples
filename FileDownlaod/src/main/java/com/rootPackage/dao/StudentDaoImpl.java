package com.rootPackage.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rootPackage.model.Student;

@Component
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public Student getObjS(Integer eId) {
		System.out.println("IMPL Emp id ::"+eId);	
		return (Student)sessionFactory.getCurrentSession().get(Student.class, eId);
		
	}
	
	
}
