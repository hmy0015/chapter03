package com.javaex.ex04;

public class ShapeApp {

	public static void main(String[] args) {
		Ractangle[] rArray = new Ractangle[3];
		Ractangle r01 = new Ractangle("red", "red", 5, 5);
		Ractangle r02 = new Ractangle("black", "black", 50, 50);
		Ractangle r03 = new Ractangle("yellow", "yellow", 100, 100);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
			System.out.println();
		}

		System.out.println("===================================");
		System.out.println();
		
		// 원 그리기
		Circle[] cArray = new Circle[3];
		Circle c01 = new Circle("red", "red", 5);
		Circle c02 = new Circle("black", "black", 50);
		Circle c03 = new Circle("yellow", "yellow", 100);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
			System.out.println();
		}
	}
}
