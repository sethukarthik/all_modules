package com.all_modules.dsapractice;

import static org.junit.Assert.assertEquals;

import java.util.Stack;
import org.junit.Test;


/*
 * Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ('(' or ')', and in any positions)
*/ 

/*
 * Pseudo Code
 * Convert the input string into a character array
 * add each character to the stack
 *		if the top element is '(' and the current element is ')' then remove the top element from the stack
 * 		and skip the current element
 * at the end of iteration stack will have only non pair(not closed) brackets
 * finally return the size of the stack
 * space: O[N]
 * Time: O[N]
*/


public class Parentheses {
	
	@Test
	public void example1() {
		String input = "()))((";
		assertEquals(4,  findMinBracketsRequired(input));
	}
	
	@Test
	public void example2() {
		String input = ")";
		assertEquals(1,  findMinBracketsRequired(input));
	}
	
	@Test
	public void example3() {
		String input = "()())";
		assertEquals(1,  findMinBracketsRequired(input));
	}
	
	@Test
	public void example4() {
		String input = "";
		assertEquals(0,  findMinBracketsRequired(input));
	}
	
	@Test
	public void example5() {
		String input = "(()()))";
		assertEquals(1,  findMinBracketsRequired(input));
	}
	
	private int findMinBracketsRequired(String input) {
		char[] charArray = input.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char ch : charArray) {
			if(!stack.empty() && stack.peek() == '(' && ch == ')') { // ( -> ( , ) -> ( ). 
				stack.pop();
			}else {
				stack.push(ch);
			}
		}
		return stack.size();
	}
	
}
