package com.snqpil.section02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : "양수가 아니다";
		System.out.println( result );
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2 && num2 == num3) ? "true" : "false";
		
		System.out.println(result);
		
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.println(result);
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int man = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int can = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+ can/man );
		System.out.println("남는 사탕 개수 : "+ can%man);
		
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int gra = sc.nextInt();
		System.out.print("반 : ");
		int cla = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gen = sc.next().charAt(0);
		System.out.print("성적 : ");
		double sco = sc.nextDouble();
		
		String gend = (gen == 'M') ? "남" : (gen == 'F') ? "여" : "";
		
		DecimalFormat frmt = new DecimalFormat();
		frmt.setMaximumFractionDigits(2);
		// Get only 2 decimal points
		
		System.out.println(gra+"학년 "+cla+"반 "+num+"번 "+name+" "+gend+"학생의 성적은 "+frmt.format(sco)+"이다.");
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		System.out.println(result);
		
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		double avg = (kor+eng+mat)/3;
		
		System.out.println("합계 : "+ (kor+eng+mat) );
		System.out.println("평균 : "+ avg );
		
		String pass = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(pass);
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.next().charAt(7);
		
		String gen = (num == '1') ? "남자" : "여자";
		System.out.println(num);
		System.out.println(gen);
		
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		String result = (num3 <= num1 || num3 > num2) ? "true" : "false";
		System.out.println(result);
		
		
		
	}

	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2 && num2 == num3) ? "true" : "false";
		System.out.println(result);
		
	}

	public void practice11() {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int ASal = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int BSal = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int CSal = sc.nextInt();
		
		double Asi = ASal + ASal * 0.4;
		double Bsi = BSal + BSal * 0;
		double Csi = CSal + CSal * 0.15;
		
		String result1 = (Asi >= 3000) ? "3000 이상" : "3000 미만";
		String result2 = (Bsi >= 3000) ? "3000 이상" : "3000 미만";
		String result3 = (Bsi >= 3000) ? "3000 이상" : "3000 미만";
		
		System.out.println("A사원의 인센티브포함 연봉 : "+ Asi);
		System.out.println(result1);
		System.out.println("B원의 인센티브포함 연봉 : "+ Bsi);
		System.out.println(result2);
		System.out.println("C사원의 인센티브포함 연봉 : "+ Csi);
		System.out.println(result3);
		
	}

}
