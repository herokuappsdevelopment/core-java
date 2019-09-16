package com.isn.core.collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack();
		
		stack.push("xyf");
		stack.add(1, "123");
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		

	}

}
