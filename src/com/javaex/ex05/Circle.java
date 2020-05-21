package com.javaex.ex05;

public class Circle extends Shape {
	private int radius;

	// 생성자
	public Circle() {}
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	// getter/setter
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	// draw
	public void draw() {
		System.out.println("#면색 : " + super.getFillColor() + " / #선색 : " + super.getLineColor()
							+ "\n#반지름 : " + radius + "\n");
	}
}
