package com.javaex.ex01;

public class PersonApp {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 25);
		Student s1 = new Student("서울고등학교");
		p1.showInfo();
		s1.showInfo();
	}
}
