package leetCodeProblems;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

public class ValidParentheses {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if(stack.isEmpty()) return false;
				char top = stack.pop();
				if(top == '(' && c == ')' ||
				   top == '{' && c == '}' ||
				   top == '[' && c == ']') continue;
				return false;
						
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println("String "+ s + " is valid? : " + isValid(s)); 
	
	}


}
