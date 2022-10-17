package com.accenture.lkm;

import java.util.Scanner;

public class Calculations {

	int result;

	// add - return int value
	public int addition(int x, int y) {
		result = x + y;
		return result;
	}
	public static void main(String[] args) {
		Calculations cl = new Calculations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter value for x");
		int x = sc.nextInt();
		System.out.println("Eneter value for y");
		int y = sc.nextInt();
		int value=cl.addition(x, y);//calling function
		System.out.println("addition of two numbers by calling function "+value);
		sc.close();
	}

}
