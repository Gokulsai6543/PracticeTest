package testing;

import java.util.Stack;

public class ValidParenthisis {

	public static boolean checkValid(String s) {
		Stack<Character> stackList = new Stack<Character>();
		char[] chars = s.toCharArray();
		for(char c:chars) {
			if(!stackList.empty()) {
			if(c==')') {
				if(stackList.pop()=='(') {
					continue;
				}
				else {
					return false;
				}
			}
			if(c=='}') {
				if(stackList.pop()=='{') {
					continue;
				}
				else {
					
					return false;
				}
			}
			if(c==']') {
				if(stackList.pop()=='[') {
					continue;
				}
				else {
					return false;
				}
			}else {
				stackList.add(c);
			}
			}else {
				stackList.add(c);
			}
			
		}
		return stackList.empty();
		}
	
	public static void main(String[] args) {
		
		System.out.println(checkValid("{[]}"));

	}
}
