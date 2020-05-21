package com.javaex.ex03;

public class PointApp {
	public static void main(String[] args) {
		Point p1 = new Point(4, 4);
		p1.showInfo();
		
		System.out.println();
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.showInfo();

		System.out.println();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "red");
		cp2.showInfo();
		
	}
}
