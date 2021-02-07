package primeNos;

import java.util.Scanner;

public class PrimeNo {
	static int[] array;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no ");
		
		int number = scanner.nextInt();
		array = new int[number+1];
		array[0] = -1;
		for(int i = 1;i<= number; i++) {
			array[i] = i;
		}
		
		for(int num=2;num < Math.sqrt(number);num++) {
			crossCut(number, num);
		}
		System.out.println("Printing prime number");
		for(int num=2;num <=number;num++) {
			if(array[num] != 1) {
				System.out.print(array[num] + " ,");
			}
		}
	}

	private static void crossCut(int number, int num) {
		// TODO Auto-generated method stub
		if(array[num] == 1) {
			return;
		}
		for(int i=2*num; i <=number ; i=i+num) {
			array[i] = 1;
		}
		
	}

}
