package string;

public class IndexOfpattern {

	static int index(char[] text, char[] pattern) {
		
		int flag=0,index;
		
		if(pattern.length > text.length) {
			return -1;
		}
		
		for(int i=0;i< text.length;i++) {
			
			index =i;
			for(int j=0;j< pattern.length;j++) {
				
				
				if(text[i+j] == pattern[j]);
				else {
					
					flag =-1;
					break;
				}
				
				
			}
			if(flag == -1) {
				continue;
			}else return index;
			
			
		}
		return flag;
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
