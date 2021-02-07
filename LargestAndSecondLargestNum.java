import java.util.Scanner;

public class LargestAndSecondLargestNum {

	
	public static void findLargestAndSecondLargest(int[] list,int len) {
		int larg, secondLarg;
		int loc1,loc2;
		
		if(list[1] >= list[0]) {
			larg = list[1];
			loc1=1;
			secondLarg = list[0];
			loc2=0;
		}else {
			loc1=0;
			loc2=1;
			larg = list[0];
			secondLarg = list[1];
		}
		
		for(int i=2;i<len ;i++) {
			
			if(list[i] >= larg && list[i]> secondLarg) {
				loc2=loc1;
				loc1=i;
				
				secondLarg=larg;
				larg = list[i];
			
			}else if(list[i] >=secondLarg) {
				secondLarg = list[i];
				loc2=i;
			}
			
			
		}
		loc1++;loc2++;
		System.out.println("at index :"+loc1+" largest :"+larg+""
				+"at index :"+loc2+ "secondLargest  :"+secondLarg);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner scanner = new Scanner(System.in);
		int[] list= {
				1,3,5,2,4,7,9,0
		};
		
		
		findLargestAndSecondLargest(list, list.length);
		
		
		
		
		
		
		
	}

}
