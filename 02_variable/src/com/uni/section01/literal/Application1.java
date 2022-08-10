package com.uni.section01.literal;
/* 패키지 선언부
 * 가장 첫번째줄에 작성해야한다.
 * 모든 클래스는 패키지 내에 존재해야한다.
 * com.uni.section01 : 도메인주소의 역순이다
 * 
 * section01.uni.com 
 * */

/*
 * [] 대괄호
 * {} 중괄호
 * () 소괄호
 * 
 * 탭 = 스페이스 4칸, Shift+탭
 * 
 * Ctrl+Shift+F
 * */
public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 여러 가지 값의 형태를 출력해보자 */
	      /* 1. 숫자 형태의 값
	       *  1-1. 정수 형태의 값
	       *  1-2. 실수 형태의 값
	       * 2. 문자 형태의 값
	       * 3. 문자열 형태의 값
	       * 4. 논리 형태의 값
	       */
	      
	      /* 1. 숫자 형태의 값 */
	      /* 1-1. 정수 형태의 값 출력 */
	      System.out.println(123);
	      /* 1-2. 실수 형태의 값 출력 */
	      System.out.println(1.23);
	      
	      /* 2. 문자 형태의 값 출력 */
	      System.out.println('a'); //한 글자만 문자이다, 문자는 홑따옴표로 감싸준다         
	      //System.out.println('ab'); //두개 이상 -> 컴파일 에러 발생한다(빨간색줄)        
	      //System.out.println('');         
	      System.out.println('1'); //문자 1로 출력된다        
	      
	      /* 3. 문자열 형태의 값 출력 */
	      System.out.println("안녕하세요"); // 문자열은 쌍따옴표로 감싸준다     
	      System.out.println("123"); // 문자열로 본다        
	      System.out.println(""); // 문자열의 경우 공백도 괜찮다           
	      System.out.println("a"); // 문자 a와는 다르다 (문자열임)        
	      
	      /* 4. 논리 형태의 값 출력 */
	      System.out.println(true); 
	      System.out.println(false); 
	}

}
