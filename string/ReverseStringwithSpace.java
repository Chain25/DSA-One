package string;

public class ReverseStringwithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "     I       am starting this java DSA lecture    ";
		
		//System.out.println(a.trim());
		String array[] = a.trim().split("\\s+");
		String result="";
		System.out.println(result);
		for(int i=array.length-1;i>=0;i--) {
			String res =array[i].strip();
			result = result+res+" ";
			System.out.println("\'"+res);
		}
		System.out.println(result);
		
//		String ar = "Chain";
//		System.out.println(ar.concat(" Singh"));
//		System.out.println(ar);
	}

}
