package com.javaex.ex02;

public class Person {
	private String name;
	private int age;
	
	// 생성자
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString
	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
	
	// showInfo
	public void peShowInfo() {
		System.out.println("#이름 : " + name);
		System.out.println("#나이 : " + age);
	}
}
