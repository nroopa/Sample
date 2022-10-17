package com.accenture.lkm.operators;

import java.util.Scanner;

public class TernaryOper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number for i ");
		int i=sc.nextInt();
		System.out.println("Enter number for j ");
		int j=sc.nextInt();
		int result=(i>j)? i :j ;
		System.out.println(result);
		
	}

}
