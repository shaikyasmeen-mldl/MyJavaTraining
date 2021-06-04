package com.rakuten.ds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class GenericExample2 {
	
	

		public static <T,R> List<R> transformedlist(List<T> words,Function<T,R> matchFunction)
		   {
			List<R> filteredlist= new ArrayList<R>();
		    for(T x:words){
		      
		    	R t=matchFunction.apply(x);
		            filteredlist.add(t);
		        }
		    return filteredlist;
		   }
		public static void main(String[] args)
		{
			
			List<String> words = Arrays.asList("hi", "hello", "yas");
			
			List<Integer> wordLengths = transformedlist(words,String::length);
			System.out.println(wordLengths);
			 
		}
		}


