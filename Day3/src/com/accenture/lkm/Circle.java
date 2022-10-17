package com.accenture.lkm;

import java.util.Scanner;

public class Circle {
double pi=3.14f;
int radius;
double circumference; 
public void areaOfCirlce() {
	circumference= pi * radius* radius;
	System.out.println("area of circle is: "+circumference);
}
public static void main(String[] args) {
	Circle c=new Circle();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value for radius ");
	int r=sc.nextInt();
	c.radius=r;
	c.areaOfCirlce();
	
}

}
