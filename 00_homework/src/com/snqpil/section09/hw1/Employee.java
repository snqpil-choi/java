package com.snqpil.section09.hw1;

public class Employee extends Person {
	
	private int salary;		//급여
	private String dept;	//부서
	
	public Employee() {
		super();
	}
	
	

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public String information() {
		return super.information() + "또한, 월급은 " + salary + "원이고, 부서는" + dept + "이다.";
	}
	
	
}
