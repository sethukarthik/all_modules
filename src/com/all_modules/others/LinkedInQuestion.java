package com.all_modules.others;

import java.util.ArrayList;
import java.util.List;

public class LinkedInQuestion {
	static void method_1() {
		List<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("tRuE"));
		list.add(Boolean.TRUE);
		System.out.println(list);
		System.err.println(list.get(1) instanceof Boolean);
	}
	
	static void method_2() throws InterruptedException {
		int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];
          
        // array of Strings
        String[] strArray = new String[3];
        
        int in[] = new int[3];
        
        in[0] = 0;
        in[1] = 2;
        
        System.out.println(in.clone());
        in[2] = 3;
        in.getClass();
                  
        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
	}
	
	public static void main(String[] args) throws InterruptedException {
		method_2();
	}
}
