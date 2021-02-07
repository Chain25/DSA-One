package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String detail[][] = {
				{"city","Ajmer"},
				{
					"distt","Ajmer"
				},
				{
					"state","Raj"
				}
		};
		
		Map<String , String> myMap =Arrays.stream(detail)
				.collect(Collectors.toMap(m -> m[0], m -> m[1]));
		System.out.println(myMap);
	}

}
