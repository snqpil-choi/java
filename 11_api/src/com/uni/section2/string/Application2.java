package com.uni.section2.string;

public class Application2 {

	public static void main(String[] args) {
		
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3); // 주소값이 달라서 false
		System.out.println(str3 == str4);
		
		//동일한 문자열은 동일한 hashcode 반환하도록 재정의되어있다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		str2 += "oracle";
		System.out.println( str1 == str2 );
		
		
		System.out.println(str1.equals(str4)); // 문자열 비교
		
	}

}
