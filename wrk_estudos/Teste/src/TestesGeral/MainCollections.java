
package TestesGeral;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainCollections {
	
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		if (!lst.contains(1))
			lst.add(1);
		if (!lst.contains(1))
			lst.add(1);
		
		System.out.println(lst);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(1);
		set.add(1);
		
		System.out.println(set);

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Leonardo", 19);
		map.put("Mauricio", 26);
		map.put("Cesar", 28);
		map.put("Cesar", 29);
		map.remove("Cesar");
		
		System.out.println(map);
	}
}
