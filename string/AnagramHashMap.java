package string;

import java.util.HashMap;

public class AnagramHashMap {
	static HashMap<Character, Integer> hashMap;

	static HashMap<Character, Integer> hashMap1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="stackoverflow";
		String b="flowerovstack";
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hashMap1 = new HashMap<Character, Integer>();
		
		char aArray[] = a.toCharArray();
		for(char val : aArray) {
			if(!hashMap.containsKey(val)) {
				hashMap.put(val,1);
			}else {
				hashMap.replace(val, hashMap.get(val)+1);
			}
		}
		System.out.println(hashMap+" size"+hashMap.size());
		
		char bArray[] = b.toCharArray();
		checkForAnagram(bArray);
		
		
	}
	private static void checkForAnagram(char[] bArray) {
		// TODO Auto-generated method stub
		for(char val : bArray) {
			try{
				if(hashMap.get(val) == null) {
					System.out.println("not Anagram");
					break;
				}
				else {
					hashMap.put(val,hashMap.get(val)-1);
				
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
				
		}
		System.out.println("Anagram");
	}

	

}
