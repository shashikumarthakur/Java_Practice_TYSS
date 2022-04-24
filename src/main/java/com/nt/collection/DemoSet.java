package com.nt.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add("Ravi");
		set.add(null);
		set.add(null);
		set.add(10);
		set.add(20);
		set.add("Vivek");
		set.add("Ravi");
		set.add('c');
		
		System.out.println(set);
		
		TreeSet tset=new TreeSet();
		//tset.add(null);
		tset.add("Shashi");
		tset.add(10);
		
		tset.add("Ravi");
		tset.add("Ravi");
		//tset.add(tset);
		System.out.println(tset);
		
	}
}
