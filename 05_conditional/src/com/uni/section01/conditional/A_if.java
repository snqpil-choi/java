package com.uni.section01.conditional;

import java.util.Scanner;

public class A_if {

	public void testSimpleIfStatement() {
		
		/**
	     * sc.nextLine() : 버퍼에서 '엔터' 이전까지의 모든 값을 가져온 후 '엔터'를 비워주는 역할
	     * 그 외의 메소드  : 버퍼에서 '엔터' 이전까지의 값을 가져온 후 '엔터'를 비워주지 않음
	     * 
	     * 따라서 sc.nextInt() 후 sc.nextLine()이 오게 되면 버퍼에 남아있는 '엔터'를 sc.nextLine()이 인식하여 사용자가  값을 입력했다고 생각한 후 읽어오고 넘어가버림
	     * 
	     * (실행 한 후 sc.nextLine() 적어주기) 
	     * sc.nextLine() 메소드를 제외한 다른 메소드들 (sc.next() 또는 sc.nextXXX())은
	     * 해당 값만 읽어온 채 사용자가 입력한 '엔터'는 버퍼에 남아있게된다.
	     * 
	     * 하지만 sc.nextLine() 메소드는 사용자가 입력한 한 줄에 대한 정보 모두 
	     * 즉, 엔터까지 모둘 읽어온다. 다시 말하면 나이를 입력할 때 sc.nextInt() 할 때 데이터를 입력하고 엔터를 쳤을 때 
	     * 값만 age에는 정수 값만 저장되고 '엔터'는 버퍼에 남아있는 상태이다.
	     * 
	     * 따라서 주소 값일 입력받을 때 사용되는 sc.nextLine() 메소드가 버퍼에 남아있는 '엔터'를 자동으로 읽어와서 입력이 끝났다고
	     * 생각하는 것 --> address 라는 문자열에는 빈값이 들어감
	     * 
	     * 결론 : sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드를 사용하게 된다면 버퍼에 남아있는 '엔터'를 빼주기 위해
	     * sc.nextLine() 메소드를 한 번 더 써주자
	     */
		
		/* [if문 표현식]
	     * if(조건식) {
	     *     조건식이 true일 때 실행할 명령문;
	     * }
	     * */
	      
	    /* 조건식 : true or false가 나오는 연산식을 조건식이라고 한다.
	     * 
	     * if문은 조건식의 결과 값이 참(true)이면 { } 안에 있는 코드를 실행하고,
	     * 조건식의 결과 값이 거짓(false)이면 { } 안에 있는 코드를 무시하고 넘어감
	     * */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자 한개를 입력하세요");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다");
		}
	    
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
		
	}
	
	public void testNestedIfStatement() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자 한개를 입력하세요");
		
		/* 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여 
	     * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
	     * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자 
	     * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
	     * */
		
		int num = sc.nextInt();
		
		// 양수인지 조건 확인
		if(num > 0) {
			// 양수가 맞는 경우 다시 한번 더 짝수인지 조건을 확인
			if(num % 2 == 0) {
				// 짝수가 맞는 경우
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
			}
		}
		// 조건문과 상관없이 프로그램 종료를 확인하기 위한 구문 출력
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
		
	}

}
