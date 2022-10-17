package com.accenture.lkm.operators;

import java.util.Scanner;

public class logicalOper {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number for i ");
	int i=sc.nextInt();
	System.out.println("Enter number for j ");
	int j=sc.nextInt();
	System.out.println((i>j)&&(i<=j));
	System.out.println((i>j)||(i<=j));
	System.out.println( !(i>j)|| !(i>=j));

}
}
