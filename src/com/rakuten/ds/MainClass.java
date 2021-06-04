package com.rakuten.ds;
import java.util.Arrays;

public class MainClass {
	


	public static void main(String[] args) {
		
		String better = betterString("hi", "h", (c,y) -> c.length()> y.length() );
		System.out.println(better);

	}

	public static <T> T betterString(T s1,T s2,TwoStringPredicate<T> x) {
		if(x.betterString(s1, s2)) {
			return s1;
		}else {
			return s2;
		}
	}
	
	
	
}

	
	

