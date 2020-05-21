package com.javaex.ex06;

public class Triangle extends Shape {
	private int width, height;

	// 생성자
	public Triangle() {}
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}
	
	// getter/setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	// toString
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

	// draw
	public void draw() {
		System.out.println("#면색 : " + super.getFillColor() + " / #선색 : " + super.getLineColor()
							+ "\n#가로 : " + width + " / 세로 : " + height + "\n");
	}
}
