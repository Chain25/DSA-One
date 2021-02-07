package string;

public class Anagram {
	static boolean isAnagram = false;
	
	public static void main(String[] args) {
		String a = "aab";
		String b= "aba";
		boolean visited[] = new boolean[b.length()];
		if(a.length() == b.length()) {
			
			for(int i=0;i<a.length();i++) {
				char val = a.charAt(i);
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j) == val && visited[j] == false) {
						isAnagram = true;
						visited[j] = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}
	}
}
