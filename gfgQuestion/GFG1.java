package gfgQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class GFG1 {
/*
 * this question is about
 * finding the smalles number from the given number
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = Integer.parseInt(sc.next());
		
		while(i-- > 0) {
			int num = sc.nextInt();
			Solution sol = new Solution();
			System.out.println(sol.smallestnum(num));
		}
		
		
	}
}


class Solution
{
    public String smallestnum(int num)
    {
    		
    	// this freq array is used becoz digit are form 0-9 
    	// and no of times digit occur its freq is incremented
    	int[] freq = new int[10];
    	int digit;
    	
    	// this loop is used becoz here we are storing digit frequecny in it
    	while(num > 0) {
    		digit = num % 10;
    		freq[digit]++;
    		num /= 10;
    		
    	}
    	int result=0;
    	for(int i=1;i<freq.length;i++) {
    		if(freq[i] != 0) {
    			result = i;
    			freq[i]--;
    			break;
    		}
    	}
    	
    	for(int i=0;i<freq.length;i++) {
    		while(freq[i] > 0 ) {
    			result = result*10 + i;
    			freq[i]--;
    		}
    	}
    	
    	return result+"";
//        //char[] val = N.toCharArray();
//        int[] arr = new int[N.length()];
//        
//        //Arrays.sort(val);
//        for(int i=0;i<N.length();i++) {	
//        	arr[i]=Integer.parseInt(N, N.charAt(i));
//        }
//        System.out.println(Arrays.toString(arr));
//        if(arr[0]!=0){
//            return Arrays.toString(arr);
//        }
//        int index=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                index++;
//            }
//        }
//        
//        index++;
//        int temp=arr[index];
//        arr[index] = arr[0];
//        arr[0] = temp;
//        return Arrays.toString(arr);
//        //interchange(val,index+1,0);
//    }
    // void interchange(char[] val,index,zero){
        
     }
}