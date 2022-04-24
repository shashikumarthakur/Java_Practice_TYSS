package com.nt.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		
		LinkedList llist=new LinkedList<>();
		llist.add("Shashi");
		llist.add("sanjya");
		llist.add("ravi");
		llist.add("faruq");
		System.out.println(llist);
	}

}
