package com.javaex.ex03;

public class ColorPoint extends Point{
	private String color;
	
	// 생성자
	public ColorPoint() {}
	
	public ColorPoint(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	// getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// toString
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	// showInfo
	public void showInfo() {
		System.out.println("점 x = " + super.getX() + ", 점 y = " + super.getY() + ", 점의 색상 = " + color);
	}
}
