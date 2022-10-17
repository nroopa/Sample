package com.accenture.lkm.conditional;

import java.util.Scanner;

public class Test_if {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for i ");
		int i=sc.nextInt();
		//int i=6;
		if(i>10) {
			System.out.println("i value is greate than 10");
		}
		else {
			System.out.println("i value is lesser than 10 ");
		}
	}

}
