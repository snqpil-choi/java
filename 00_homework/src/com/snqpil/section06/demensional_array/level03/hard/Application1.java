package com.snqpil.section06.demensional_array.level03.hard;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
		 * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
		 * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
		 * 
		 * -- 출석부 --
		 * 1. 홍길동
		 * 2. 이순신
		 * 3. 유관순
		 * 4. 윤봉길
		 * 5. 장영실
		 * 6. 임꺽정
		 * 7. 장보고
		 * 8. 이태백
		 * 9. 김정희
		 * 10. 대조영
		 * 11. 김유신
		 * 12. 이사부
		 * 
		 * -- 출력 예시 --
		 * == 1분단 ==
		 * 홍길동 이순신
		 * 유관순 윤봉길
		 * 장영실 임꺽정
		 * 
		 * == 2분단 ==
		 * 장보고 이태백
		 * 김정희 대조영
		 * 김유신 이사부
		 * 
		 * 출력한 이후 학생 이름을 입력 받아 몇 분단 몇 번째 줄 왼쪽/오른쪽 에 위치하는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 검색할 학생 이름을 입력하세요 : 대조영
		 * 검색하신 대조영은 2분단 두 번째 줄 오른쪽에 있습니다.
		 */

		String name[] = { "홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부" };

		String[][] dan1 = new String[3][2]; // 1분단 선언
		String[][] dan2 = new String[3][2]; // 2분단 선언

		int num = 0;

		for (int i = 0; i < dan1.length; i++) {
			for (int j = 0; j < dan1[i].length; j++) {
				dan1[i][j] = name[num];
				num++;
			}
		}

		for (int i = 0; i < dan2.length; i++) {
			for (int j = 0; j < dan2[i].length; j++) {
				dan2[i][j] = name[num];
				num++;
			}
		}

		System.out.println("== 1분단 ==");
		for (int i = 0; i < dan1.length; i++) {
			for (int j = 0; j < dan1[i].length; j++) {
				System.out.print(dan1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < dan2.length; i++) {
			for (int j = 0; j < dan2[i].length; j++) {
				System.out.print(dan2[i][j] + " ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name2 = sc.nextLine(); // name2에 입력한 이름 저장됨
		
		// for 문으로 다 검색 후 맞으면 (두번? 분단, (줄(행), j = 1:왼쪽, 2:오른쪽) 출력하기
		// ex. 검색하신 대조영은 2분단 두 번째 줄 오른쪽에 있습니다.
		
//		int No = 0; // 출석부 번호 선언 0~11
//		
//		for (int i = 0; i < name.length; i++) { // 출석부 번호를 No에 저장
//			if (name[i] == name2) {
//				System.out.print("검색하신 "+name[i]+ "은 ");
//			}
//		}
		
		
		

	}

}