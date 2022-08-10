package com.uni.method.section01;
//alt + shift + j

/**
 * <pre>
 * Class : 클래스의 이름
 * Comment : 클래스에 대한 설명
 * History
 * 2020/09/08 (작성자) 처음 작성함
 * </pre>
 * @author 작성자
 * @version 1.0.0
 * @see 참고할 class나 외부 url
 * */
public class Application4 {

	public static void main(String[] args) {
		/* 여러 개의 전달인자를 이용한 메소드 호출 테스트 */
	    /* 1. 여러 개의 매개변수를 가진 메소드 호출 */
		Application4 app4 = new Application4();
		
		app4.testMethod("홍길동", 20, '남'); // 문자열(String)은 "", 문자(char)는 ''
		//app4.testMethod(20, "유재석", 0); // 타입 안맞게 작성 불가
		
		/*2. 변수에 값을 저장해서 전달하여 호출*/
		
		String name1 = "유재석";
		int age1 = 20;
		char gender1 = '여';
		
		app4.testMethod(name1, age1, gender1);
	}
	
	
	/**
	    * <pre>
	    * 이름과 나이와 성별을 전달받아 한 번에 출력해주는 기능을 제공합니다.
	    * </pre>
	    * @param name 출력할 이름을 전달해주세요
	    * @param age 출력할 나이를 전달해주세요
	    * @param gender 출력할 성별을 전달해주세요. 성별은 변경되지 않을 것을 보장합니다.
	    */
	private void testMethod(String name, int age, final char gender) {
	      /* 매개변수도 일종의 지역변수로 분류된다.
	       * 매개변수 역시 final 키워드를 사용할 수 있다.
	       * 지역변수에 final 키워드를 붙여 상수를 만드는 것과 동일하다.
	       * final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다. (써도 되고 안써도 됨)
	       * */
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
	}

}
