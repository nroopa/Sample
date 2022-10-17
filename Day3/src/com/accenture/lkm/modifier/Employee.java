package com.accenture.lkm.modifier;

public class Employee {
private int id;
private String name;
private String designation;
private double salary;
public Employee() {
System.out.println("default constructor ");
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
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public static void main(String[] args) {
	
}

}
