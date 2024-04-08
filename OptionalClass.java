package com.java8features;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		/*String[] s=new String[15];
		String str=s[5].toUpperCase();
		System.out.println(str);
		*/
		String[] s=new String[15];
		s[5]="java";
		Optional<String>op=Optional.ofNullable(s[5]);
		if(op.isPresent()) {
			String str=s[5].toUpperCase();
			System.out.println(str);
		}else {
			System.out.println("String not present");
		}
	}

}
