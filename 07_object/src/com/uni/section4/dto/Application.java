package com.uni.section4.dto;

public class Application {

	public static void main(String[] args) {
		
		/* 생성자를 이용한 초기화 */
		UserDTO user1 = new UserDTO("ohgiraffers", "ohgiraffers", "ohgiraffers", new java.util.Date());
		System.out.println(user1.getInformation());
		// 장단점 : 한번에 넣을 순 있으나 어떤 항목에 데이터가 들어가는지 알아보기 힘들다 
		

		/* 기본 생성자와 설정자를 이용한 초기화 */
		UserDTO user2 = new UserDTO();
		user2.setId("ohgiraffers");
		user2.setPwd("ohgiraffers");
		user2.setName("ohgiraffers");
		user2.setEnrollDate(new java.util.Date());
		// 장단점 : 한번에 넣을 순 없으나 한눈에 어떤 항목에 데이터가 들어가는지 알아보기 쉽다. 
		
		
		System.out.println(user2.getInformation());

	}

}
