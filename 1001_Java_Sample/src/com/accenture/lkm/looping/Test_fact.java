package com.accenture.lkm.looping;

import java.util.Scanner;

public class Test_fact {

	public static void main(String[] args) {
		int i=1;
		int factorial=1;
		
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		while(i<=value) {
			factorial=factorial*i;
			i++;
		}
		System.out.println("factorial of given number is "+factorial);

		sc.close();
	}

}
