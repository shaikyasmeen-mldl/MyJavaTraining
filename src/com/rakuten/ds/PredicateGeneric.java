package com.rakuten.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PredicateGeneric {

	public static  <T> List<T> allMatches(List<T> words,Predicate<T> matchFunction)
	   {
		List<T> filteredlist= new ArrayList<T>();
	    for(T x:words){
	        if(matchFunction.test(x)){
	            filteredlist.add(x);
	        }
	    }
	    return filteredlist;
	   }
	public static void main(String[] args)
	{
		
		
		List<Integer> words = Arrays.asList(1, 10, 100, 1000, 10000);
		List<Integer> bigNums = allMatches(words, n -> n>500);
		//List<String> shortWords = allMatches(words, s -> s.length() < 4);
		System.out.println(Arrays.asList(bigNums));
	
	}
	}

