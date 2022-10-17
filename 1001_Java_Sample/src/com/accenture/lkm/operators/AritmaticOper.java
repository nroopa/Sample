package com.accenture.lkm.operators;

import java.util.Scanner;

public class AritmaticOper {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number for i ");
	int i=sc.nextInt();
	System.out.println("Enter number for j ");
	int j=sc.nextInt();
	System.out.println("Addition of two numbers " +(i+j));
	System.out.println("Substraction of 2 numbers" + (i-j));
	System.out.println("multiplication of 2 numbers " + (i*j));
	System.out.println("modulo of 2 number " +(i%j));
	System.out.println( "division of two numbers " +(i/j));
	
}
}
