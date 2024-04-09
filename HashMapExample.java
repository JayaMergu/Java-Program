import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap();
		m.put(1, "one");
		m.put(2, "jtwo");
		System.out.println(m);
		//HashSet<String> s=new HashSet();
		Set s1=m.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry e=(Map.Entry)itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
