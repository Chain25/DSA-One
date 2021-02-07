package string;

public class StringPatternMatching {

	static boolean patternMatching(String text, String pattern) {
		
		if(pattern.length() > text.length()) {
			
			return false;
		}
		
		int maxComparsion = text.length() - pattern.length() +1;
		
		for(int i=0;i<maxComparsion;i++) {
			String substring = SubString.subString(text,i,pattern.length());
			if(pattern.equals(substring)) {
				System.out.println("pattern index :"+i
						+" pattern :"+substring+
						" text :"+ text);
				
				
				
			}
			
		}
		
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(patternMatching("vanshika verma verma","verma")) {
			System.out.println("pattern found");
		}else {
			System.out.println("not found");
		}
		
	}

}
