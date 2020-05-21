package com.javaex.ex04;

public class Circle {
	private String fillColor, lineColor;
	private int radius;
	
	// 생성자
	public Circle() {}
	public Circle(String fillColor, String lineColor, int radius) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}
	
	// getter/setter
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// toString
	@Override
	public String toString() {
		return "Circle [fillColor = " + fillColor + ", lineColor = " + lineColor + ", radius = " + radius + "]";
	}
	
	// draw
		public void draw() {
			System.out.println("#면색 : " + fillColor + " / #선색 : " + lineColor + "\n#반지름 : " + radius);
		}
}
