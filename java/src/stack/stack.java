package stack;

import java.util.*;

public class stack {
	Stack<Integer> stack;
	public stack() {
		stack = new Stack<Integer>();
	}
	
	public int push(int i) {
		stack.push(i);
		return i;
	}
	
	public int pop() {
		int i = stack.pop();
		return i;
	}
	
	public int peek() {
		int i = stack.peek();
		return i;
	}
	
	public int size() {
		int i = stack.size();
		return i;
	}
	
	public String printStack() {
		String stackStr = "";
		Stack<Integer> temp = (Stack<Integer>) stack.clone();
		while (!temp.isEmpty()) {
			stackStr += temp.pop() + " ";
		}
		return stackStr;
	}
	
	public static void main(String[] args) {

		stack object = new stack();

		object.push(13);
		object.push(75);
		object.push(68);
		object.push(2);
		object.push(3735);
		object.push(1);
		

		System.out.println("Initial Size of Queue : " + object.size());
		System.out.println("Queue Value: " + object.printStack());
		System.out.println("Queue peek : " + object.peek());
		System.out.println("Queue pop : " + object.pop());
		System.out.println("Queue pop : " + object.pop());
		System.out.println("Queue Value: " + object.printStack());
		System.out.println("Final Size of Queue : " + object.size());
	}
	
}
