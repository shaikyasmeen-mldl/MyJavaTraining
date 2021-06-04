package com.rakuten.ds; 

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		simpleMapOps();

	}

	private static void simpleMapOps() {
		Map<String, String> map = new HashMap<>();
		map.put("E1234", "Steve Jobs");
		map.put("E2345", "Bill Gates");
		map.put("E3456", "Larry Ellison");
		map.put("E4567", "Jeff Bezos");
		map.put("E8765", "Mark Zuckerberg");
		map.put("E6789", "Larry Page");
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter an Emp ID (or quit):");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			
			if(map.containsKey(input)) {
				System.out.println("Name of employee with id "+input+" --> "+map.get(input));
			}else {
				System.out.println("No employee with id "+input);
			}
		}
		System.out.println("---------------------------");
		System.out.println("List of all emp mappings");
		
		Set<String> keys = map.keySet();
		for(String aKey : keys) {
			System.out.println(aKey+" -------> "+map.get(aKey));
		}
	}

}