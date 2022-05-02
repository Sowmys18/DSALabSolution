package com.greatLearning;
import java.util.Stack;
public class BlancingBracket {
	
	
//checking balancing brackets
	static boolean checkingBracketsBalanced(String bracketExpression) {
		//introducing character as char
		 Stack<Character> stack = new Stack<Character>();
		 
		for(int i = 0; i< bracketExpression.length(); i++)
		{
			char character = bracketExpression.charAt(i);
			//checking for first set of opening brackets
			if(character == '(' || character == '[' || character == '{')
			{
				stack.push(character);
			continue;
			
			}
			//after it comes empty
		if(stack.isEmpty())
			return false;
		//checking for second set of closing brackets
		char c;
		switch (character) {
		case'}':
		     c = stack.pop();
		     if(c== '(' || c == '[')
		    	 return false;
		     break;
		case ')':
			c = stack.pop();
			if (c == '{' || c =='[')
				return false;
			break;
		case ']':
			c = stack.pop();
			if(c == '(' || c == '{')
				return false;
			break;
		}
	}
	 return (stack.isEmpty());
	 
		}
	//main method
public static void main(String[] args)
{
	
	String bracketExpression = "([[{}]])";
	Boolean result;
	result = checkingBracketsBalanced(bracketExpression);
	if(result)
		System.out.println("The Entered String has Balanced Brackets");
	else 
		System.out.println("The Entered String do not Balanced Brackets");
}
	}
	

