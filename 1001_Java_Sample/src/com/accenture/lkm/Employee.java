package com.accenture.lkm;

public class Employee {
 private int eid;
 private String name;
 private int pno;
 private String designation;
 
 public void displayEmpData() {
	 System.out.println(eid+ " "+name+ " " +pno+ " "+designation);
 }
 public static void main(String[] args) {
	 Employee employee=new Employee();
	 employee.eid=1993365;
	 employee.name="Teju";
	 employee.pno=98989887;
	 employee.designation="TL";
	 employee=null;
	 employee.displayEmpData();
	 
	
}
}
