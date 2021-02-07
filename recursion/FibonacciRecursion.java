package recursion;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Fibonacci{
	
	
	static int calFibonacci(int num,int[] fib) {
		
		if(num == 0 || num ==1) {
			fib[num] = num;
			return fib[num];
		}
		else {
			int val = calFibonacci(num-1, fib)+calFibonacci(num -2, fib);
//			3
	
			fib[num] = val;
			return val;
			
		}
		
		
		
	}
	
	
}

public class FibonacciRecursion {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter nth number of fibonacci ");
//		int num = scanner.nextInt();
//		int[] fib= new int[num+1];
//		int fibNum = Fibonacci.calFibonacci(num, fib);
//		fib[num] = fibNum;
//		
//		System.out.println(fibNum+   "    printing series also :" + Arrays.toString(fib));
//		
//		
		
		Stack<Character> stac= new Stack<>();
		char val ='A';
		
		stac.push('A');
		char pop = stac.pop();
		String anme = "Abcd";
		StringBuilder st = new StringBuilder(anme);
		st.append(")");
		System.out.println(Arrays.toString(st.toString().toCharArray()));
	}

}
