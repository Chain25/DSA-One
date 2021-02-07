import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collector;

//import jdk.nashorn.internal.ir.SetSplitState;
//import sun.jvm.hotspot.runtime.StackFrameStream;

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Set is an sub interface of Collection framework
		 * it is an data structure which don't contain duplicate value in it
		 * so to implement set we have three class of set
		 * 1 HashSet which random sort the element in it
		 * 2 LinkedListSet which place element in fashion as they are inserted
		 * 3 TreeSet , it uses comparator in it 
		 */
		Set<Integer> rank = new HashSet<Integer>(
				Arrays.asList(new Integer[] {
						1,2,3,4,5,5,1,4,66,100,101,01
				})
				);
		rank.add(0);
		rank.add(10);
		System.out.println(rank);
		//Set<Integer> set = Stream.of(1,2,3,4,6,8,8).collect(toSet());
		//Sets.newHashSet("a","v","c");
	}

}
