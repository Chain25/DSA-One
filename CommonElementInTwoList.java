import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementInTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		a.addAll(Arrays.asList(new Integer[] {
			1,2,3,5,6
		}));
		
		b.addAll(Arrays.asList(new Integer[] {
				3,4,9
		}));

		ArrayList<Integer> c =new ArrayList<Integer>();
		System.out.println(a);
		System.out.println(b);

		for(Integer val : b) {
			if(a.contains(val)) {
				c.add(val);
			}
		}
		System.out.println(c);
	}

}
