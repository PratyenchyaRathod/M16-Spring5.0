package com.cg.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.di.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student1 s = c.getBean("s",Student1.class);
		s.cheating();
		
		AnotherStudent s1 = c.getBean("s1",AnotherStudent.class);
		s1.cheating();
	}

}
