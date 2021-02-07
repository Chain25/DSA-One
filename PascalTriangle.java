//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows");
		Scanner scanner = new Scanner(System.in);
		for(int z=1;z<=5;z++) {
			System.out.println(2*z-1);
		}
		int row = scanner.nextInt();
		int j,k,x;
		for(int i=1;i<=row;i++) {
			j=i;
			x=i-1;
			for(int spaces =1;spaces <= row-i;spaces ++) {
				System.out.print(" ");
			}
			/*      1
			 *     232
			 *    34543
			 *   4567654
			 *  567898765   
			*/
			/*
			 * it iterate as   
			 */
			
			
			for(k=1;k<=i;k++) {
				System.out.print(j);
				j++;
			}
			--j;
			for(;x>0;x--) {
				
				--j;
				System.out.print(j);
				//System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}

}
