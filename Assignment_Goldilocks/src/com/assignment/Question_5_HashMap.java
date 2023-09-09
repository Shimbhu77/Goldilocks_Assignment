package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class Question_5_HashMap {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Ram",36);
		map.put("Shyam",60);
		
		for(String key : map.keySet())
		{
			System.out.println("key : "+key+" , value : "+map.get(key));
		}
	}
}
