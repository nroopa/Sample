package com.accenture.lkm;

public class Car {
String model;
String color;


public void accelerate() {
	System.out.println("Accelerate method ");
}
public void applyBreaks() {
	int noBreaks=2;//local variable - scope is inside method
	System.out.println("Apply break "+noBreaks);
}
public void CarInfo() {
	System.out.println(model+ " " +color );
}
public static void main(String args[]){
	Car c=new Car();
c.model="xyz"; //instance variable
c.color="xxx";//instance variable
//c.noBreaks=2; -CTE not declared in class
c.accelerate();
c.applyBreaks();
c.CarInfo();
}
}
