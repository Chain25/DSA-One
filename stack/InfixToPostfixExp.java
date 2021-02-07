package stack;

import java.util.Stack;

public class InfixToPostfixExp {

	static String infixToPostfix(String exp) {
		
		Stack<Character> st = new Stack<>();
		String result = new String();
		st.push('(');
		int index=0;
		while(!st.empty()) {
			
			char val = exp.charAt(index);
			index++;
			
			if(Character.isLetterOrDigit(val)) {
				
				result += val;
			}else if(val == '(') {
				
				
				st.push(val);
			}else if(val == ')') {
				
				while(st.peek() != '(') {
					
					result +=st.pop();
				}
				st.pop();
				
			}else {
				while(precedence(st.peek()) >= precedence(val)) {
					result += st.pop();
				}
				st.push(val);
				
			}
		
		}
		return result;
		
		
		
		
	}
	
	static int precedence(char value) {
		
		switch (value) {
		case '+':
		case '-':	
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default :
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(infixToPostfix("a+b*(a^c)"));
	}

}
