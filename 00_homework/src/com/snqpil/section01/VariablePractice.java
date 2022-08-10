package com.snqpil.section01;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("성별을 입력해주세요 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("키를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("키 "+ height + "인 "+ age + "살 " + gender + "자 "+ name + "님 반갑습니다^^");
		
	}

	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int first = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int second = sc.nextInt();
		
		System.out.println("더하기 결과 : "+ (first + second));
		System.out.println("빼기 결과 : "+ (first - second));
		System.out.println("곱하기 결과 : "+ (first * second));
		System.out.println("나누기 몫 결과 : "+ (first/second));
		
	}

	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("가로 : " );
		double a = sc.nextDouble();
		
		System.out.print("세로 : " );
		double b = sc.nextDouble();
		
		System.out.println("면적 : "+ (a * b));
		System.out.println("둘레 : "+ 2*(a+b));
		
	}

	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.print("문자열을 입력하세요 : " );
		String text = sc.nextLine();
		System.out.println("첫 번째 문자 : "+ text.charAt(0));
		System.out.println("두 번째 문자 : "+ text.charAt(1));
		System.out.println("두 번째 문자 : "+ text.charAt(2));
//		잠시 보류, 문자열을 여러번 쳐야만 결과가 나오는 문제가 있음 -- 영준에게 도움받음
	}

}
