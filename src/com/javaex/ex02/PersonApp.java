package com.javaex.ex02;

public class PersonApp {
	public static void main(String[] args) {
		/*
		Person p1 = new Person("홍길동", 25);
		Student s1 = new Student("이정재", 45, "한국고등학교");
		p1.peShowInfo();
		System.out.println();
		s1.stShowInfo();
		*/
		
		Person p = new Student("정우성", 45, "서울고");
		((Student)p).stShowInfo();
		
		System.out.println();
		
		((Student)p).setSchoolName("제주고");
		((Student)p).stShowInfo();
	}
}
