package com.accenture.lkm.conditional;

import java.util.Scanner;

public class Test_switch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number for i ");
		int i=sc.nextInt();

		System.out.println("Enter number for j ");
		int j=sc.nextInt();
		
		System.out.println("Enter value from 1 to 5");
		int key=sc.nextInt();
		switch (key) {
		case 1: 
				int add=i+j;
				System.out.println("addition of 2 numbers "+add);
				break;
		case 2: 
			int sub=i-j;
			System.out.println("substraction of 2 numbers "+sub);
			break;
		case 3: 
			int mul=i*j;
			System.out.println("multi of 2 numbers "+mul);
			break;
		case 4: 
			int div=i/j;
			System.out.println("div of 2 numbers "+div);		
			break;
		case 5: 
			int modulo=i%j;
			System.out.println("modulo of 2 numbers "+modulo);
			break;
		default:
			System.out.println("not matching with any case ");
			
		}
		
	}

}
