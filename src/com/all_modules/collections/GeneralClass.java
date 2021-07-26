package com.all_modules.collections;

import java.util.ArrayList;
import java.util.List;

public class GeneralClass {
	int i;

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("123");
		
		boolean con123 = list.contains("123");
		System.out.println(con123);
		
	}
}
