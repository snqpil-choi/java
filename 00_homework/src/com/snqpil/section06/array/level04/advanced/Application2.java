package com.snqpil.section06.array.level04.advanced;

public class Application2 {
	
	/* 숫자 야구게임 만들기 
	 * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
	 * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
	 * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
	 * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
	 * 
	 * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
	 * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
	 * 
	 * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
	 * 횟수는 차감하지 않는다.
	 * 
	 * -- 프로그램 예시 (난수 7416 의 경우) --
	 *
	 * 10회 남으셨습니다.
	 * 4자리 숫자를 입력하세요 : 1234
	 * 아쉽네요 0S 2B 입니다.
	 * 9회 남으셨습니다.
	 * 4자리 숫자를 입력하세요 : 5678
	 * 아쉽네요 0S 2B 입니다.
	 * 8회 남으셨습니다.
	 * 4자리 숫자를 입력하세요 : 7416
	 * 정답입니다.
	 * */
	
	private static boolean checkNum(int nums[],int index) { 
		//nums: n자리 난수, index: 1자리 난수(중복체크값)
		
		for(int i=0; i<nums.length; i++) {	//난수 자릿수만큼 중복체크
			if(nums[i]==index)  			//중복 시 true 반환, 중복 없을 시 false 반환
				return true;
			} 
			return false;
		}		

	public static void main(String[] args) {
		
		int nums[] = new int[4];	//3자리 난수(배열값:3)
		int index = 0;				//1자리 난수(중복체크값) 
		
		for(int i=0; i<nums.length; i++) {		
			//난수 자릿수만큼 반복하여 랜덤한 숫자 배열에 입력
			
			do {
				index = (int)(Math.random()*10); //1부터 9까지의 한자리 변수 생성
				} while (checkNum(nums,index));	 //배열과 변수 중복여부 체크
			nums[i] = index;					 //중복되지 않는 수만 배열에 저장
		}										 //for문으로 배열 수만큼 반복
		
		for(int i=0; i<nums.length; i++) {		 //전체 배열 출력
			System.out.print(nums[i]);
		}
		
		// 중복 없는 4자리 난수 발생 완료. 4자리 입력부터 시작
		
	}
	
		
}
