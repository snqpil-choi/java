package com.snqpil.section07.level03.hard;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// 스캐너를 이용해서 모든 직원 정보를 입력 받아
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번 입력 : ");
		int number = sc.nextInt();
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("부서 입력 : ");
		String dept = sc.next();
		
		System.out.print("직급 입력 : ");
		String job = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("급여 입력 : ");
		int salary = sc.nextInt();
		
		System.out.print("보너스율 입력 : ");
		double bonus = sc.nextDouble();
		
		System.out.print("연락처 입력 : ");
		String phone = sc.next();
		sc.nextLine();
		
		System.out.print("주소 입력 : ");
		String adr = sc.nextLine(); // 그냥 넘어가는 오류발생
		
		
		System.out.println();
		
		
		// 기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경후
		
		EmployeeVO emp = new EmployeeVO();
		
		emp.setNumber(number);
		emp.setName(name);
		emp.setDept(dept);
		emp.setJob(job);
		emp.setAge(age);
		emp.setGender(gender);
		emp.setSalary(salary);
		emp.setBonusPoint(bonus);
		emp.setPhone(phone);
		emp.setAddress(adr);
		
		
		// getter를 이용하여 모든 필드 값 출력
		
		System.out.println(emp.getNumber());
		System.out.println(emp.getName());
		System.out.println(emp.getDept());
		System.out.println(emp.getJob());
		System.out.println(emp.getAge());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		System.out.println(emp.getBonusPoint());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddress());
		
		sc.close();

	}

}
