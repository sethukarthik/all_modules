package com.all_modules.others;

import java.util.ArrayList;
import java.util.List;

public class LinkedInQuestion {
	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("tRuE"));
		list.add(Boolean.TRUE);
		System.out.println(list);
		System.err.println(list.get(1) instanceof Boolean);
	}
}
