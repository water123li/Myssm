package com.sjtu.myssm.student.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.sjtu.myssm.student.dao.StudentDao;
import com.sjtu.myssm.student.model.Student;

@Repository("studentDao")
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao {

	@Override
	public Student getStudent(Long studentId) {
		this.getSqlSession();
		return null;
	}
	
	@Override
	public void saveOrUpdateStudent(Student student) {
	}

}
