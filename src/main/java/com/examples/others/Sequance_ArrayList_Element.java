package com.examples.others;

import java.util.ArrayList;
import java.util.HashMap;

public class Sequance_ArrayList_Element {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);
		list.add(800);
		list.add(900);
		list.add(1000);
		//100,200,400,500,700,800,900,1000
		list.remove(2);
		list.remove(4);
		
		System.out.println(list);
		
	}
}
