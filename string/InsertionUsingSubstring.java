package string;

public class InsertionUsingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "ABCDXYZ";
		String pattern ="EFGH";
		int index = 5;
		String result;
		result =insertion(text,pattern,index-1);
		System.out.println(result);
		
	}

	private static String insertion(String text, String pattern, int index) {
		// TODO Auto-generated method stub
		
		return SubString.subString(text, 0, index)+pattern+SubString.subString(text, index, text.length()-index);
		
		
	}

}
