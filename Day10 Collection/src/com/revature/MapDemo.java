package com.revature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map isdCodes = new HashMap();
		
		isdCodes.put(91, "India");
		isdCodes.put(1, "USA");
		isdCodes.put(94, "Srilanka");
		isdCodes.put(65, "Singapore");
		isdCodes.put(92, "India");
		
		System.out.println(isdCodes);
		
		Set keys = isdCodes.keySet();
		keys.forEach(System.out::println);
		
		for (Object object : keys) {
			System.out.println("key = " + object +" value = "+isdCodes.get(object));
		}
	}

}
