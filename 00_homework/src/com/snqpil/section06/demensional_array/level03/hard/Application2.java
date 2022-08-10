package com.snqpil.section06.demensional_array.level03.hard;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* 홀수를 하나 입력 받아 입력받은 크기 만큼의 정사각형 형태의 2차원 배열을 할당하고
		 * 모래시계 모양으로 *을 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 홀수 하나를 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * ***** [0][0~n-1] 
         *  ***  [1][1~n-2] = "*", [0],[n-1] = " "
         *   *   [(n-1)/2][(n-1)/2] = "*"
         *  ***  [n-2][1~n-2] = "*", [0],[n-1] = " "
         * ***** [n-1][0~n-1] = "*"
         * 
         * 단, 홀수를 입력하지 않은 경우 "홀수만 입력해야 합니다." 출력
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		char arr[][]=new char[num][num];
		int left = 0; int right = num-1;
		
		if (num % 2 == 0) {
			System.out.println("홀수만 입력해야 합니다.");
		} else {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(left<=j && right>=j) 
						arr[i][j] = '*';
					else 
						arr[i][j] = ' ';	
				}
				if(i<num/2) {
					left++; right--;
				}
				else {
					left--; right++;
				}
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println("");
			}
		}

		
	}
}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("홀수 하나를 입력하세요 : ");
//		int n = sc.nextInt();
//		if (n % 2 == 0) {
//			System.out.println("홀수만 입력해야 합니다.");
//		}
//
//		String[][] star = new String[n][n];
//		
//		// * 또는 공백 입력
//		for (int i = 0 ; i < (n-1)/2 ; i++) {
//			for (int j = 0 ; j <= (n-1)/2 ; j++) {
//				star[i][j+i] = "*";
//				star[i][n-1-(i+j)] = "*";
//				
//			}
//		}
//		
//		for (int i = 0 ; i < star.length ; i++) {
//			for (int j = 0 ; j < star.length ; j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
//		
//		sc.close();
//	}
//}
