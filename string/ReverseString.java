package string;

import java.util.Arrays;
import java.util.Scanner;


class Reverse{
	
	 static String reverse(String value) {
		
		
		char[] array = value.toCharArray();
		
		int startIndex=0;
		int endIndex = array.length-1;
		
		while(startIndex < endIndex) {
			
			char temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		
		return Arrays.toString(array);
	}
}
public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string :");
		System.out.println("Rever of above :"+Reverse.reverse(scanner.next()));
		
		//System.out.println(c);
		

	}

}
