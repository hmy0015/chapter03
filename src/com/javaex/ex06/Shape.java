package com.javaex.ex06;

public class Shape {
	private String fillColor, lineColor;
	
	
	// 생성자
	public Shape() {}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
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
	
	// toString
	@Override
	public String toString() {
		return "Shape [fillColor = " + fillColor + ", lineColor = " + lineColor + "]";
	}

	// draw
	public void draw() {
		System.out.println("#면색 : " + fillColor + " / #선색 : " + lineColor);
	}
}
