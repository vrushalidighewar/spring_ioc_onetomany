package com.app.pojo;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{

	private int id;
	private String name;

	private List<Address> add;

	public Student() {

	}

	public Student(int id, String name, List<Address> add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAdd() {
		return add;
	}

	public void setAdd(List<Address> add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy object creation");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("setup for object creation");
	}

	/*public void setUp() {
		System.out.println("setup for object creation");
	}
	public void cleanUp() {
		System.out.println("destroy object creation");
	}*/
		
	
}
