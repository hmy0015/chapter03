package com.javaex.ex03;

public class Point {
	private int x, y;
	
	// 생성자
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter/setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	// showInfo
	public void showInfo() {
		System.out.println("점 x = " + x + ", 점 y = " + y);
	}
}
