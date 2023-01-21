package com.xworkz.task.boot;

import java.util.Map;
import java.util.TreeMap;

public class CountryWithCode {

	public static void main(String[] args) {

		Map<String, Integer> map = new TreeMap<String, Integer>();

		map.put("India", 91);
		map.put("Austrelia", 81);
		map.put("US", 23);
		map.put("Angola", 81);
		map.put("Arenmia", 21);

		System.out.println(map);
		
		map.entrySet().forEach(c->System.out.println(c));
		
		boolean ref =map.containsKey("India");
		System.out.println(ref);
		
		
		System.out.println("================");
		map.remove("Angola", 81);
		System.out.println(map);
	}
}

