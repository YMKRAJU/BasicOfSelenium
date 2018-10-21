package com.OPPS1;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		ht.put(1, "MKR");
		ht.put(2, 27);
		ht.put(3, "Yarragudi");
		
		System.out.println(ht.size());
		ht.put(4, 'K');
		ht.put("A", "TestEngg");
		ht.put("B", "Infosys");
		System.out.println(ht.get("A"));
		System.out.println(ht.get(3));
		System.out.println(ht.get(4));
		System.out.println(ht.size());
		ht.remove(4);
		System.out.println(ht.size());
		
		for (int i = 1; i < ht.size()-1; i++) {
			System.out.println(ht.get(i));			
		}
		
	}

}
