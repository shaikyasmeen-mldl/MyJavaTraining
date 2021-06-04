package com.rakuten.ds;
import java.util.Arrays;
//lambda example

public class JavaUtils {
	public static int StringUtils(String s1, String s2)
    {
        if(s1.contains("e") && !s2.contains("e"))
        return -1;
        else if(s2.contains("e") && !s1.contains("e"))
        return 1;
        else
        return 0;
    }

	
	public static void main(String[] args) {
		String[] strings= {"yasmeen","elephant","eagle","yasu","e","epic"};
		
		Arrays.sort(strings,(s1,s2)->s1.length()-s2.length());
		System.out.println(Arrays.asList(strings));
		Arrays.sort(strings,(s1,s2)->s2.length()-s1.length());
		System.out.println(Arrays.asList(strings));
		
		Arrays.sort(strings,JavaUtils::StringUtils);
		
		System.out.println(Arrays.asList(strings));
	}

}
