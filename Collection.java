import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name[] = {
					"Chain",
					"Vanshika",
					"Vojeer",
					"Abhishek"
			};
			String names="54321";
			char[] na= names.toCharArray();
			System.out.println(na.length);
			
			
			List<Character> l = new ArrayList<Character>();
			List<String> list = new ArrayList<String>
			(Arrays.asList(name));
			
			ListIterator<String> iterator =list.listIterator();
			
			while(iterator.hasNext()) {
				System.out.println(iterator.hasNext()+" "+iterator.nextIndex()+" - "+iterator.next());
			}
			while(iterator.hasPrevious()) {
				System.out.println(iterator.previousIndex()+ " - " +iterator.previous());
			}
			System.out.println("------------------");
			for(String value : list) {
				System.out.println(value);	
			}
			System.out.println("------------");
			list.forEach(System.out::println);
			
			
			List<String> l2 = list.subList(0, 2);
			System.out.println(l2);
			System.out.println(list);
			l2.add("Priyanka");
			System.out.println(l2);
			System.out.println(list);
			
	}

}
