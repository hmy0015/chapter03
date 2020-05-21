package com.javaex.ex05;

public class ShapeApp {
	public static void main(String[] args) {		
		// 사각형 관리
		Ractangle rArray[] = new Ractangle[3];
		Ractangle r01 = new Ractangle("보라색", "흰색", 50, 50);
		Ractangle r02 = new Ractangle("하늘색", "흰색", 20, 20);
		Ractangle r03 = new Ractangle("연두색", "흰색", 35, 35);

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		
		System.out.println("==============================");
		System.out.println();
		
		// 원 관리
		Circle cArray[] = new Circle[3];
		Circle c01 = new Circle("분홍색", "흰색", 5);
		Circle c02 = new Circle("노란색", "흰색", 20);
		Circle c03 = new Circle("초로색", "흰색", 15);

		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
		// 삼각형 관리
		Triangle tArray[] = new Triangle[3];
		Triangle t01 = new Triangle("보라색", "흰색", 50, 50);
		Triangle t02 = new Triangle("하늘색", "흰색", 20, 20);
		Triangle t03 = new Triangle("연두색", "흰색", 35, 35);

		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
	}
}
