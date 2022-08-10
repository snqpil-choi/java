package com.uni.section2.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
	
	/* LinkedHashSet 클래스 */
    /* HashSet이 가지는 기능을 모두 가지고 있고
     * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
     * JDK 1.4 부터 제공하고 있다. */

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		
		lhset.add(new String("java"));
		lhset.add(new String("oracle"));
		lhset.add(new String("jdbc"));
		lhset.add(new String("html"));
		lhset.add(new String("css"));
		
		System.out.println("lhset : " + lhset);
		
		
		TreeSet<String> tset = new TreeSet<String>(lhset);
		
		System.out.println(tset);
		
		
		
		
	}

}
