package com.snqpil.section06.array.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
		 * 검색할 문자를 하나 입력 받아 
		 * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 문자열을 하나 입력하세요 : helloworld
		 * 검색할 문자를 입력하세요 : l
		 * 
		 * -- 출력 예시 --
		 * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
		 * */
		
		char[] str = new char[10]; // 문자형 배열 선언
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열을 하나 입력하세요 : ");
		String text = sc.nextLine(); // 입력된 문자열을 text 변수에 저장
		
		for (int i=0 ; i < text.length() ; i++) {
			str[i] = text.charAt(i); // text에 저장된 문자열을 문자 배열 str[]에 한 글자씩 저장
		}
		
		System.out.print("검색할 문자를 입력하세요 : ");
		char sch = sc.next().charAt(0); // 검색할 문자 sch 변수
		
		int sum = 0; // 검색한 문자의 개수를 셀 변수
		
		for (int i=0 ; i < str.length ; i++) {
			if (str[i] == sch) {
				sum += 1;
			}
		}
		
		System.out.println("입력하신 문자열 "+text+"에서 찾으시는 문자 "+sch+"은 "+sum+"개 입니다.");
		
	}
}
