package com.rootPackage.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rootPackage.model.Student;


public interface StudentDao{
	
	@Transactional
	public Student getObjS(Integer eId);
		
	
}
