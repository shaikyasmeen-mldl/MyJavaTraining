package com.rakuten.ds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Predicatesecond {
	

	
	public static List<String> transformedlist(List<String> words,Function<String,String> matchFunction)
	   {
		List<String> filteredlist= new ArrayList<String>();
	    for(String x:words){
	       // if(matchFunction.test(x)){
	    	String t=matchFunction.apply(x);
	            filteredlist.add(t);
	        }
	    return filteredlist;
	   }
	public static void main(String[] args)
	{
		
		List<String> words = Arrays.asList("hi", "hello", "yas");
		
		List<String> excitingWords = transformedlist(words, s -> s+"!");
		System.out.println(Arrays.asList(excitingWords));
	}
	}



