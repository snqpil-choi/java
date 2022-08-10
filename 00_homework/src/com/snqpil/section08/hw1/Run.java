package com.snqpil.section08.hw1;

public class Run {

	public static void main(String[] args) {
		
		// 객체배열을 크기 3으로 할당 한 뒤
		Employee[] empArray = new Employee[3];
		
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		empArray[0] = new Employee();
		
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
		empArray[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		empArray[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for (int i = 0 ; i < empArray.length ; i++) {
			System.out.println(empArray[i].information());
		}
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
		empArray[0].setEmpNo(0);
		empArray[0].setEmpName("김말똥");
		empArray[0].setDept("영업부");
		empArray[0].setJob("팀장"); 
		empArray[0].setAge(30);
		empArray[0].setGender('M'); 
		empArray[0].setSalary(3000000); 
		empArray[0].setBonuspoint(0.2); 
		empArray[0].setPhone("01055559999");
		empArray[0].setAddress("전라도 광주");
		
		empArray[1].setDept("기획부");
		empArray[1].setJob("부장");
		empArray[1].setSalary(4000000);
		empArray[1].setBonuspoint(0.3);
		
		System.out.println(empArray[0].information());
		System.out.println(empArray[1].information());
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 + (급여 * 보너스포인트)) * 12
		for (int i = 0 ; i < empArray.length ; i++) {
			
			System.out.println(empArray[i].getEmpName()+"의 연봉 : " + (int)((empArray[i].getSalary()+(empArray[i].getSalary()*empArray[i].getBonusPoint() ))*12)+"원");
		}
		
		// 3명 직원의 연봉 평균을 구하여 출력
		int avg = 0;
		for (int i = 0 ; i < empArray.length ; i++) {
			avg += (int)((empArray[i].getSalary()+(empArray[i].getSalary()*empArray[i].getBonusPoint() ))*12/3);
		}
		System.out.println("직원들의 연봉의 평균 : " + avg + "원"); // 평균 출력
		
		

	}

}
