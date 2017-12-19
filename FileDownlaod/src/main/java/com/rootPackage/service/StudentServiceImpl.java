package com.rootPackage.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rootPackage.dao.StudentDao;
import com.rootPackage.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;
	
	@Transactional
	public Student getObjS(Integer sId) {		
		return dao.getObjS(sId);
	}
	

}
