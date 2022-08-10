package com.uni.section3;

public class SubClass extends SuperClass {
	
	
	/* 1. 메소드 이름 변경하면 에러 발생
	 * 2. 메소드의 리턴타입 변경하면 에러 발생
	 * 3. 매개변수 갯수나, 타입이 변경되면 에러 발생
	 * 
	 *  */
	
	@Override
	public void method(int num) {}
	
	// private 메소드는 오버라이딩 불가
//	@Override
//	private void priateMethod() {}
	
//	//final 메소드 오버라이딩 불가
//	@Override
//	public final void finalMethod() {}
	
	//부모메소드의 접근 제한자와 같거나 더 넓은 범위로 오버라이딩 가능
//	@Override
//	void protectedMethod() {
//		// TODO Auto-generated method stub
//		super.protectedMethod();
//	}
	
	
//	protected void protectedMethod() {} // 같은 범위여서 가능
	public void protectedMethod() {} // 더 넓은 범위로 가능
	
		
}
