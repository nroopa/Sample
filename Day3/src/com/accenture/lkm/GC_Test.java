package com.accenture.lkm;

public class GC_Test {
	int number;

	public static void main(String[] args) {
		GC_Test gc = new GC_Test();
		System.out.println(gc.number=59);// 0
		GC_Test gc1 = gc;
		System.out.println(gc1.number);// 0

		gc = null;
		System.out.println(gc);
		System.out.println(gc1.number);
		gc1 = null;
		System.out.println(gc1);
	}

}
