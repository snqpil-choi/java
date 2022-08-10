package com.uni.method.section01;

public class Application8 {

	   public static void main(String[] args) {
		   /* static 메소드를 호출하는 방법
		    * 클래스명.메소드명();  <- 이런 방식으로 호출한다.
		    * */
		   
		   System.out.println("10 + 20 의 합 " + Application8.sumTwoNumbers(10, 20)); 
		   //Application8. 까지 쓰면 뒤에 사용가능 메소드가 뜬다 10과 20의 합을 알아보기 위해 인자를 넣어줌
		   
		   // 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다
		   System.out.println("10 + 20 의 합 " + sumTwoNumbers(10,20));
	   }
	   
	   
	   // static 메소드
	   public static int sumTwoNumbers(int first, int second) {
		   return first + second;
	   }

}
