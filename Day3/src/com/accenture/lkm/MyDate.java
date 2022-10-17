package com.accenture.lkm;

public class MyDate {
private int date;
private int month;
private int year;
//default constructor
public MyDate() {
	System.out.println("default constructor in Mydate class");
}
//parameterized constructor
public MyDate(int date, int month, int year) {
	System.out.println("Parameterized construtor ");
	this.date=date;
	this.month=month;
	this.year=year;
}
 public void DateInformation() {
	 System.out.println("Date is: \n" +date+"-" +month+ "-"+year );
 }
public static void main(String[] args) {
	MyDate date=new MyDate(); //calling default constructor
	date.DateInformation();
	System.out.println("******************************");
	MyDate date1=new MyDate(10,9,2022);//calling parameterized constructor 
	date1.DateInformation();
}


	
}
