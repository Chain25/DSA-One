
public class SortGenericList implements Comparable<SortGenericList> {
	public final Integer id;
	public final String name;
	
	public SortGenericList(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : "+this.id+" name : "+this.name;
	}

	@Override
	public int compareTo(SortGenericList o) {
		// TODO Auto-generated method stub
		return o.id.compareTo(this.id);
	}
}
