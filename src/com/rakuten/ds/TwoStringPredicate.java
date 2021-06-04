package com.rakuten.ds;
@FunctionalInterface
public interface TwoStringPredicate<T> {
	boolean betterString(T s1,T s2);
	}
