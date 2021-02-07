package string;

public class AnagramOther {
	public static void main(String args[]) {
		
		String a="aab!@#CBA", b= "#@!abaABC";
		
		int aArray[] =new int[256];
		int bArray[] = new int[256];
		boolean isAnagram = false;
		for(char c : a.toCharArray()) {
			
			int index = c;
			aArray[index]++;
		}
for(char c : b.toCharArray()) {
			
			int index = c;
			bArray[index]++;
		}

		for(int i=0;i<256;i++) {
			if(aArray[i]!=bArray[i]) {
				isAnagram = false;
				break;
			}
			isAnagram = true;
		}

		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}
		
	}
}
