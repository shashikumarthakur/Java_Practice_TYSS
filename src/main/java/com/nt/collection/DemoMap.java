package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(10, "shashi");
		map.put(20,"Ravi");
		map.put(30, "vivek");
		map.put(40,"saraswat");
		map.put(50, "milan");
		map.put(60,"rohit");
		map.put(70, "raj");
		map.put(80,"shubham");
		System.out.println(map);
		
		ArrayList list=new ArrayList(map.keySet());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
