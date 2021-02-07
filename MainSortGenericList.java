import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSortGenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SortGenericList> sortGenericLists
			=new ArrayList<SortGenericList>();
		sortGenericLists.add(new SortGenericList(4, "chain"));
		sortGenericLists.add(new SortGenericList(3, "VAnshika"));
		sortGenericLists.add(new SortGenericList(2, "Hanuman ji"));
		sortGenericLists.add(new SortGenericList(1, "Shri Ram ji") );
		sortGenericLists.add(new SortGenericList(0, "Sita mata"));
		System.out.println("----------------");
		Collections.sort(sortGenericLists);
		System.out.println(sortGenericLists);
		Collections.sort(sortGenericLists, new Comparator<SortGenericList>() {
			@Override
			public int compare(SortGenericList o1, SortGenericList o2) {
				// TODO Auto-generated method stub
				return o1.id.compareTo(o2.id);
			}
		});
		System.out.println(sortGenericLists);
	}

}
