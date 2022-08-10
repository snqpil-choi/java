package com.snqpil.section06.array.level04.advanced;

public class Application1 {
	
	/* 로또번호 생성기 
	 * 6칸 짜리 정수 배열을 하나 생성하고
	 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
	 * 오름차순 정렬하여 출력하세요
	 * */

	private static boolean checkNum(int nums[], int index) {
		// nums: n자리 난수, index: 1자리 난수(중복체크값)

		for (int i = 0; i < nums.length; i++) { // 난수 자릿수만큼 중복체크
			if (nums[i] == index) // 중복 시 true 반환, 중복 없을 시 false 반환
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int nums[] = new int[6];
		int index = 0; // 1자리 난수(중복체크값)

		for (int i = 0; i < nums.length; i++) {
			// 난수 자릿수만큼 반복하여 랜덤한 숫자 배열에 입력

			do {
				index = (int) (Math.random() * 45 + 1); // 1부터 9까지의 한자리 변수 생성
			} while (checkNum(nums, index)); // 배열과 변수 중복여부 체크 (중복 시 true 출력)
			nums[i] = index; // 중복되지 않는 수만 배열에 저장
		} // for문으로 배열 수만큼 반복

		for (int i = 1; i < nums.length; i++) {
			/* 인덱스가 증가할 때 마다 처음부터 해당 인덱스까지 값을 비교하는 반복문 */
			for (int j = 0; j < i; j++) {
				/*
				 * 오름차순 정렬을 위한 처리 - 오름차순이기때문에 앞에있는 숫자가 크면 바꿔줘야한다. 내림차순은 부등호만 반대로 처리하면 됨
				 **/
				// 비교 주체가 비교대상보다 작을 경우에 값을 교환
				if (nums[i] < nums[j]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) { // 전체 배열 출력
			System.out.print(nums[i] + " ");

		}
	}
}
