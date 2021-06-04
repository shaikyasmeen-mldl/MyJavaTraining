package com.rakuten.ds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class PredicateExample {
public static List<String> allMatches(List<String> words,Predicate<String> matchFunction)
   {
	List<String> filteredlist= new ArrayList<String>();
    for(String x:words){
        if(matchFunction.test(x)){
            filteredlist.add(x);
        }
    }
    return filteredlist;
   }
public static void main(String[] args)
{
	
	List<String> words = Arrays.asList("hi", "hello", "yas");
	List<String> shortWords = allMatches(words, s -> s.length() < 4);
	System.out.println(Arrays.asList(shortWords));
}
}




