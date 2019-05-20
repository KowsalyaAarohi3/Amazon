import java.util.*;

public class CollectionList {
	
	public static void main(String[] args) {
		
		List<Integer> si = new ArrayList<Integer>();
		si.add(90);
		si.add(55);
		si.add(4);
		si.add(3);
		si.add(80);
		si.set(1, 35);
		System.out.println(si);

		int index = si.indexOf(80);
		System.out.println(index);
		

		int index1 = si.indexOf(100);
		System.out.println(index1);

		
				}

}
