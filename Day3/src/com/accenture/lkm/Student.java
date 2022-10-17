package com.accenture.lkm;

public class Student {

	private int id;// class member
	private String name;

	// private String grade;
	// private String address;
	public void setId(int id) {// method argument
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(199353);
		student.setName("Hari");
	System.out.println(student.getId());
	System.out.println(student.getName());
	}
}
