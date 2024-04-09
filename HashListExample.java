/*Write a Java program to append the specified element to the end of a hash set.*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashListExample {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=1;i<=10;i++) {
			h.add(i);
		}
		Iterator<Integer> itr=h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//adding at last an element
		h.add(11);
		System.out.println(h);
	}
}
