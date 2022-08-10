package com.snqpil.section06.array.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
		 * 성별 자리 이후부터 *로 가려서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 주민등록번호를 입력하세요 : 990101-1234567
		 * 
		 * -- 출력 예시 --
		 * 990101-1******
		 */
		
		Scanner sc = new Scanner(System.in);

		char narr[] = new char[14]; // 문자 배열 선언

		System.out.print("주민등록번호를 입력하세요 : ");
		String num = sc.nextLine(); // 주민등록번호를 문자열 변수에 저장

		for (int i = 0; i < num.length(); i++) {
			narr[i] = num.charAt(i);
		} // for문을 통해 배열 값 입력 완료

		for (int i = 0; i < narr.length; i++) {
			if (i >= 8) {
				narr[i] = '*';
			}
			System.out.print(narr[i]);
		}

	}
}
