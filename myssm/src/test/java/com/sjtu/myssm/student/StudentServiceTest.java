package com.sjtu.myssm.student;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sjtu.myssm.student.service.StudentService;

/**
 * 学生接口单元测试
 * 
 * @author Administrator
 * 
 */
public class StudentServiceTest {
	private static StudentService studentService;
	private static ClassPathXmlApplicationContext applicationContext;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"/cn/shaviation/mymaven/common/applicationContext.xml");
		studentService = (StudentService) applicationContext.getBean("studentService");
	}

	@Test
	public void getStudent() throws Exception {
		
	}
	
	@Test
	public void saveUser() {
	} 
	

	@AfterClass
	public static void teardown() throws Exception {
	}
}
