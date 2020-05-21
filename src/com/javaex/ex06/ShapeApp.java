package com.javaex.ex06;

public class ShapeApp {
	public static void main(String[] args) {		
		Shape sArray[] = new Shape[9];
		
		Shape r01 = new Ractangle("보라색", "흰색", 50, 50);
		Shape r02 = new Ractangle("하늘색", "흰색", 20, 20);
		Shape r03 = new Ractangle("연두색", "흰색", 35, 35);

		Shape c01 = new Circle("분홍색", "흰색", 5);
		Shape c02 = new Circle("노란색", "흰색", 20);
		Shape c03 = new Circle("초로색", "흰색", 15);

		Shape t01 = new Triangle("흰색", "보라색", 15, 15);
		Shape t02 = new Triangle("흰색", "하늘색", 27, 27);
		Shape t03 = new Triangle("흰색", "연두색", 30, 30);

		sArray[0] = r01;	sArray[1] = r02;	sArray[2] = r03;
		sArray[3] = c01;	sArray[4] = c02;	sArray[5] = c03;
		sArray[6] = t01;	sArray[7] = t02;	sArray[8] = t03;
		
		for(int i = 0; i < sArray.length; i++) {
			if(i % 3 == 0 && i != 0 
					
					) {
				System.out.println("=============================\n");
			}
			((Shape)sArray[i]).draw();
		}
	}
}
