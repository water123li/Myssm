package com.sjtu.myssm.student.dao;

import com.sjtu.myssm.student.model.Student;

public interface StudentDao{
	/**
	 * 通过ID获取学生信息
	 * 
	 * @param studentId
	 * @return
	 */
	public Student getStudent(Long studentId);

	/**
	 * 改变学生名称
	 */
	public void saveOrUpdateStudent(Student student);

}
