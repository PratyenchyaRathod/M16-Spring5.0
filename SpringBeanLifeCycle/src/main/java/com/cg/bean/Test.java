package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.SQLDataException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao a = c.getBean(StudentDao.class);
		

	}

}
