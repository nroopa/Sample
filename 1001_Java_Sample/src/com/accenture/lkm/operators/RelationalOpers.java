package com.accenture.lkm.operators;

import java.util.Scanner;

public class RelationalOpers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for i ");
		int i=sc.nextInt();
		System.out.println("Enter number for j ");
		int j=sc.nextInt();
		System.out.println(i==j);//true
		System.out.println(i>j);//false
		System.out.println(i>=j);//tr
		System.out.println(i<j);//fa
		System.out.println(i<=j);//tr
		System.out.println(i!=j);//fa

	}

}
