package com.javaex.ex02;

public class Student extends Person{
	private String schoolName;

	// 생성자
	public Student() {}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}

	public Student(String name, int age, String schoolName) {
		// 자기 자신의 생성자 호출 => this(), 부모 생성자 호출 => super()
		// 필드 호출 => this.필드 or super.필드
		super(name, age); // 부모 생성자 호출
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
	public void stShowInfo() {
		System.out.println("#이름 : " + super.getName());
		System.out.println("#나이 : " + super.getAge());
		System.out.println("#학교 : " + schoolName);
	}
}
