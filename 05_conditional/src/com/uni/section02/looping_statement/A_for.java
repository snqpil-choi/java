package com.uni.section02.looping_statement;

import java.util.Scanner;

public class A_for {
	
	
	/* 반복문의 기본 흐름 테스트 */
    
    /* [for문 표현식]
     * for(초기식; 조건식; 증감식) {
     *     조건을 만족하는 경우 수행할 구문(반복할 구문);
     * }
     * */
	
	
	
	public void testSimpleForStatement() {
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		
	}
	
	public void testForExample1() {
		/* 무엇을 반복하는지를 확인하고, 반복문으로 개선해보기 */
	      
	      /* 10명의 학생 이름을 입력받아 이름을 출력해보자 */
	      /* 반복해야 할 내용이 무엇인지와 몇 번 반복해야 하는지를 확인해보자!! */
	      Scanner sc = new Scanner(System.in);
//	      System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//	      String student1 = sc.nextLine();
//	      System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//	      
//	      System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//	      String student2 = sc.nextLine();
//	      System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//	      
//	      System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//	      String student3 = sc.nextLine();
//	      System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//	      
//	      System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
//	      String student4 = sc.nextLine();
//	      System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//	      
//	      System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//	      String student5 = sc.nextLine();
//	      System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
//	      
//	      System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//	      String student6 = sc.nextLine();
//	      System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
//	      
//	      System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//	      String student7 = sc.nextLine();
//	      System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//	      
//	      System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//	      String student8 = sc.nextLine();
//	      System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//	      
//	      System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//	      String student9 = sc.nextLine();
//	      System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//	      
//	      System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//	      String student10 = sc.nextLine();
//	      System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//	      
//	      System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
	      
	      for(int i = 1; i <= 10 ; i++) {
	    	  System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
		      String student1 = sc.nextLine();
		      System.out.println(i + " 번째 학생의 이름은 " + student1 + "입니다.");
	      }
	      System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
	      
	      sc.close();
	      

	}
	
	public void testForExample2() {
		/* 1 ~ 10까지의 합계를 구하시오*/
		int sum = 0;
		for(int i = 1; i <= 10 ; i++) {
			sum = sum + i; // sum += i
			System.out.println(i + "만큼 더해졌습니다.");
		}
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
		
	}
	
	public void testForExample3() {
		/* 5 ~ 10 사이의 난수를 발생시켜서
		 * 1부터 발생한 난수까지의 합계를 구해보자.
		 * */
		int random = (int) (Math.random() * 6 + 5);
		int sum = 0;
		for (int i = 1; i <= random ; i++) {
			sum += i;
			System.out.println(i + " 만큼 더해졌습니다.");
		}
		System.out.println("1부터 " + random + "까지의 합은 " + sum + " 입니다.");
	}
	
	public void testForExample4() {
	      
	      /* 숫자 두 개를 입력 받아 작은 수 에서 큰 수까지의 합계를 구하세요 
	       * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다. 
	       * */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		if (num1 > num2) {
			for (int i = num2; i <= num1 ; i++) {
				sum += i;
			}
		} else if (num2 > num1) {
			for (int i = num1; i <= num2 ; i++) {
			sum += i;
			}
		} else {System.out.println("두 수가 같습니다.");}
		
		System.out.println("작은 수에서 큰 수까지의 합은 " + sum + "입니다.");
		
		sc.close();
		/*min과 max 변수를 선언한 후 if문을 통해 작은 수를 min에 큰 수를 max에 넣은 후
		 * for문을 사용하는 방식도 가능하다*/
	}
	
	public void printSimpleGugudan() {
		/* 키보드로 2~9 사이의 구구단을 입력받아 
	     * 2~9 사이인 경우 해당 단의 구구단을 출력하고,
	     * 그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다. 출력" */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan >=2 && dan <=9) {
		     //System.out.println(dan + " * " + 1 + " = " + (dan * 1));
	         //System.out.println(dan + " * " + 2 + " = " + (dan * 2));
	         //System.out.println(dan + " * " + 3 + " = " + (dan * 3));
	         //System.out.println(dan + " * " + 4 + " = " + (dan * 4));
	         //System.out.println(dan + " * " + 5 + " = " + (dan * 5));
	         //System.out.println(dan + " * " + 6 + " = " + (dan * 6));
	         //System.out.println(dan + " * " + 7 + " = " + (dan * 7));
	         //System.out.println(dan + " * " + 8 + " = " + (dan * 8));
	         //System.out.println(dan + " * " + 9 + " = " + (dan * 9));
			
			for(int su = 1; su <= 9 ; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}
		
	}
	
	public void printGugudanFromTwoToNine() {
		
		/* 2단부터 단을 1씩 증가시키는 반복문 */
		
		for(int dan = 2; dan < 10 ; dan++) {
			
			for(int su = 1; su < 10 ; su++) {
				
			System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}
		
	}
	
	public void printUpgradeGugudanFromTwoToNine() {
		      
	    /* 단을 2단부터 9단까지 하나씩 증가시킨다. */
	    for(int dan = 2; dan < 10; dan++) {
	       
	       /* 한 단씩 구구단을 출력하는 메소드를 호출하며 인자로 단을 전달한다. */
	       printGugudanOf(dan);
	       /* 한 단을 출력하고 한 줄을 띄운다. */
	       System.out.println();
	       }
		      
	}

	private void printGugudanOf(int dan) {
		
		for (int su = 1; su < 10 ; su++) {
		System.out.println(dan + " * " + su + " = " + (dan * su));
		// for 문 안에 한 행만 작성시에는 중괄호를 생략할 수 있다.
		}
	}
	
	public void printStarInputRowTimes() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력할 행수를 입력하세요");
		int row = sc.nextInt();
		
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	public void printStar(int times) {
		for(int j = 1 ; j <= times ; j++) {
			System.out.print("*");
	    }
	}
	
		
	public void printTriangleStars() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력할 행수를 입력하세요");
		int row = sc.nextInt();
		
		for(int i = 1 ; i <= row ; i++) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//			}
			printStar(i);
			
			System.out.println();
		}
		sc.close();
	}

}
