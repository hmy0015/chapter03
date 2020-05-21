package com.javaex.ex01;

public class Student{
	private String schoolName;

	// 생성자
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	
	// getter/setter
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// toString
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	// showInfo
	public void showInfo() {
		System.out.println(", 학교 : " + schoolName);
	}
}
