package com.snqpil.section07.level01.basic;

public class Application {

	public static void main(String[] args) {
		
		MemberVO mem = new MemberVO(); // mem 객체 생성
		
		// getter를 이용해서 필드의 초기값 확인
		System.out.println(mem.getId());
		System.out.println(mem.getPwd());
		System.out.println(mem.getName());
		System.out.println(mem.getAge());
		System.out.println(mem.getGender());
		System.out.println(mem.getPhone());
		System.out.println(mem.getEmail());
		
		// setter를 이용해서 필드 값 변경
		mem.setId("user01");
		mem.setPwd("pass01");
		mem.setName("홍길동");
		mem.setAge(20);
		mem.setGender('M');
		mem.setPhone("010-1234-5678");
		mem.setEmail("hong123@greedy.com");
		
		
		
		// getter를 이용해서 변경된 필드값 확인
		System.out.println("변경 후 id : "+ mem.getId());
		System.out.println("변경 후 pwd : "+ mem.getPwd() );
		System.out.println("변경 후 name : "+ mem.getName());
		System.out.println("변경 후 age : "+ mem.getAge());
		System.out.println("변경 후 gender : "+ mem.getGender());
		System.out.println("변경 후 phone : "+ mem.getPhone());
		System.out.println("변경 후 email : "+mem.getEmail());
		
		
		
	}

}
