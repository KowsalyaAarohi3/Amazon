import java.util.*;

public class ListSet {
	
	public static void main(String[] args) {
		List<Integer> ref = new ArrayList<Integer>();
		Set<Integer> ref1 = new LinkedHashSet<Integer>();
		ref.add(55);
		ref.add(7);		
		ref.add(17);
		ref.add(7);
		ref.add(67);
		System.out.println(ref);
		
		ref1.addAll(ref);
		System.out.println(ref1);
		
		ref.clear();
		System.out.println(ref);
			
	}

}
