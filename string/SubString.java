package string;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		System.out.println("Enter String :");
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		System.out.println(string);
		int startIndex;
		int subStringLength;
		//scanner.next();
		
		System.out.println("Enter starting index");
		startIndex = scanner.nextInt();
		System.out.println("also substring length");
		subStringLength = scanner.nextInt();
		
		String subString = subString(string , startIndex-1, subStringLength);
		
		System.out.println("Substring : "+subString);
		
		
		
	}

	static String subString(String string, int startIndex, int subStringLength) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		char value[] = string.toCharArray();
		
		while(subStringLength !=0) {
			sb.append(value[startIndex]);
			startIndex++;
			subStringLength--;
		}
		return sb.toString();
	}

}
