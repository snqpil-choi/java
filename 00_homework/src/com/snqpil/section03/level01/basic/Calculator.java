package com.snqpil.section03.level01.basic;

public class Calculator {
	
	/*메소드 호출 확인용 메소드 호출*/
	public void checkMethod() {
		System.out.println("메소드 호출 확인");
	}
	
	/* 함수를 호출하여 1~10까지의 합을 리턴 받아 출력 */
	public int sum1to10(int a) {
		int sum = 0;
		for (int i = 1 ; i <= a ; i++ ) {
			sum += i;
		}
		
		return sum;
				
	}
	/* 10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출 */
	public int checkMaxNumber(int a, int b) {
		return (a > b) ? a : b;
		
	}

	/* 10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력 */
	public int sumTwoNumber(int a, int b) {
		return a + b;
		
	}

	/* 10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력 */
	public int minusTwoNumber(int a, int b) {
		return a - b;
		
	}

}
