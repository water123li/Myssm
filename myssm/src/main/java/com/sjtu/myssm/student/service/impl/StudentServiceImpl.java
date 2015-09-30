package com.sjtu.myssm.student.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sjtu.myssm.student.dao.StudentDao;
import com.sjtu.myssm.student.model.Student;
import com.sjtu.myssm.student.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}
	@Resource(name="studentDao")
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	@Override
	public Student getStudent(Long studentId) {
		Student student = studentDao.getStudent(studentId);
//		this.changStudentName(student);
		return student;
	}
	
	@Override
	public Student changStudentName(Student student) {
		student.setName("哈哈");
		return student;
	}
	
	@Override
	public void saveOrUpdateStudent(Student student) {
		studentDao.saveOrUpdateStudent(student);		
	}
	

}
