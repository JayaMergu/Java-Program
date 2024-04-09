/*Write a Java program to convert a hash set to a tree set.*/
import java.util.HashSet;
import java.util.TreeSet;

public class ConvertSetExample {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=1;i<=10;i++) {
			h.add(i);
		}
		
		System.out.println(h);
		
		TreeSet<Integer> tr=new TreeSet<Integer>(h);
		//tr.addAll(h);// hashSet object
		System.out.println(tr);
	}
}

