package com.OPPS1;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		System.out.println("Interger Type Array List");
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(100);
		ai.add(700);
		ai.add(600);
		
		for (int j = 0; j < ai.size()-1; j++) {
			System.out.println(ai.get(j));			
		}
		System.out.println(ai);
		
		System.out.println("Object Type Array List");
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("MKR");
		ar.add(7);
		ar.add('Y');
		System.out.println(ar.size());
		
		ar.add("Raju");
		ar.add(77.7);
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		System.out.println("**************");
		System.out.println(ar);
		for (int i = 1; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
	}

}
