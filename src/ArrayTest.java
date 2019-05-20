
public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] si = new int[4];
		si[0]=1;
		si[1]=1;
		si[2]=4;
		si[3]=78;
		int len=si.length;
		System.out.println(len);
		for(int i : si) {
		System.out.println(i);
				}
	}

}
