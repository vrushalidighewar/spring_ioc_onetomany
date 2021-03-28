package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext ac=new ClassPathXmlApplicationContext("di.xml");
		
	Student student=(Student) ac.getBean("std");
	
				System.out.println(student);
	
	}
}
