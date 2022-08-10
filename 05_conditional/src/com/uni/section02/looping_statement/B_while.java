package com.uni.section02.looping_statement;

import java.util.Scanner;

public class B_while {
	
    /**
     * * while문
     * 
     * [초기식]
     * 
     * while(조건식) {
     *       반복적으로 실행할 코드;
     *       [증감식]
     * }
     * 
     * 조건식이 true일 경우 해당 실행코드 실행
     * 
     * 조건식 검사 --> true일 경우 실행코드 실행
     * 조건식 검사 --> true일 경우 실행코드 실행
     * 조건식 검사 --> false일 경우 실행코드 실행 X --> 반복문 빠져 나감
     * 
     * 
     */
	
	
	
	   public void testSimpleWhileStatement() {
		   
		   /* 1부터 10까지 1씩 증가시키면서 (10번) i값을 출력하는 기본 반복문*/
		   
		   int i = 1;
		   while(i <= 10) {
			   System.out.println(i);
			   i++;
		   }
	   }
	   
	   public void testWhileExample1() {
		   
		   /* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기 */
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("문자열 입력 : ");
		   String str = sc.nextLine();
		   
		   /* charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능 */
		      /* length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환한다. */
		      /* index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다. 
		       * 만약 존재하지 않는 인덱스에 접근하게되면 StringIndexOutOfBoundsException이 발생한다.!!*/
		   
		   int index = 0;
		   while(index < str.length()) {
			   char ch = str.charAt(index);
			   
			   System.out.println( index + " : " + ch);
			   
			   index++;
		   }
		   
//		   for (int i = 0 ; i < str.length ; i ++) {
//			   char ch = str.charAt(i);
//			   System.out.println( i + " : " + ch);
//		   }
		   
		   sc.close();
		   
	   }
	   
	   /**<pre>
	    * while문 연습을 위한 예제2
	    * 1부터 입력받은 정수 까지의 합계를 구하는 예제
	    * </pre>
	    */
	   public void testWhileExample2() {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("정수 입력 : ");
		   int num = sc.nextInt();
		   
		   int i = 1;
		   int sum = 0;
		   while (i <= num) {
			   sum += i;
			   i++;
		   }
		   
		   System.out.println("1부터 "+ num + "까지의 합계 : " + sum);
		   
		   
	   }
	   
	   /**<pre>
	    * while문 연습을 위한 예제3
	    * while문을 이용하여 구구단을 2단부터 9단까지 출력
	    * </pre>
	    */
	   public void testWhileExample3() {
		   
		   int dan = 2;
		   int su = 1;
		   
		   while (dan <= 9) {
			   while (su <= 9) {
				   System.out.println(dan+" * "+su+" = "+ (dan*su) );
				   su++;
			   }
			   dan++;
			   su = 1;
		   }
		   
	   }
	   
	   /**
	    * * do-while문
	    * 
	    * [초기식]
	    * 
	    * do{
	    *       반복적으로 실행할 코드;
	    * 
	    *       [증감식]
	    * 
	    * }while(조건식); 
	    * 
	    * 
	    * 초기식  --> 무조건 한번은 실행 --> 증감식 
	    * 조건식 --> true일 경우 실행 --> 증감식
	    * 조건식 --> true일 경우 실행 --> 증감식
	    * 조건식 --> false일 경우 빠져나감
	    * 
	    * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데
	    * do while문은 첫 실행은 조건식없이 무조건 수행된다는 점
	    * 
	    */
		public void testSimpleDoWhileStatement() {

			do {
				System.out.println("최초 한번 동작함");
			} while (false);

			System.out.println("반복문 종료 확인");
		}
	   
	   /**<pre>
	    * do-while문 연습을 위한 예제1
	    * 입력한 문자열을 반복적으로 출력한다.
	    * 단, exit가 입력되면 반복을 멈춘다.
	    * </pre>
	    */
		public void testDoWhileExample1() {

			Scanner sc = new Scanner(System.in);

			String str = "";

			do {

				System.out.println("문자열을 입력해주세요");
				str = sc.nextLine();
				System.out.println(str);

			} while (!str.equals("exit")); // exit가 아닐때 계속 반복

			System.out.println("프로그램을 종료합니다.");

		}

	}
