package com.uni.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {

		/* 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보세요 */

		int[] sarr = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.print("5명의 자바 점수를 정수로 입력 : ");
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = sc.nextInt();
		}

		double sum = 0.0;
		double avg = 0.0;

		for (int i = 0; i < sarr.length; i++) {
			sum += sarr[i];
		}

		avg = sum / sarr.length;

		System.out.println("sum :" + sum);
		System.out.println("avg :" + avg);

		sc.close();

	}

}
