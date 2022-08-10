package com.snqpil.section03.level01.basic;

public class Application {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		
		Calculator calc = new Calculator();
		
		/*메소드 호출 확인용 메소드 호출*/
		calc.checkMethod();
		
		/* 함수를 호출하여 1~10까지의 합을 리턴 받아 출력 */
		int sum = calc.sum1to10(a);
		System.out.println("1부터 "+a+"까지의 합 : " + sum);
		
		/* 10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출 */
		int max = calc.checkMaxNumber(a, b);
		System.out.println("두 수 중 큰 수는 " + max + "이다.");
		
		/* 10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력 */
		int sum2 = calc.sumTwoNumber(a, b);
		System.out.println(a+"과 "+b+"의 합은 : "+ sum2);
		
		/* 10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력 */
		b = 5;
		int sub = calc.minusTwoNumber(a, b);
		System.out.println(a+"과 "+b+"의 차는 : "+sub);

	}

}
