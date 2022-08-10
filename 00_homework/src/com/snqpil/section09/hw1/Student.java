package com.snqpil.section09.hw1;

public class Student extends Person {
	
	private int grade;		// 학년
	private String major;	// 전공
	
	public Student() {
		super();
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		
		this.name = name;
		this.grade = grade;
		this.major = major;
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	public String information() {
		return super.information() + "또한, " + grade + "학년이고, 전공은" + major + "이다.";
	}
	
}
