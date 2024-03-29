package gen.types;

import java.util.HashSet;
import java.util.Set;

public class CompairUtils {

	public static void main(String[] args) {
		
		Pair<String, Integer> u1 = new Pair<>("MS Word", 101);
		Pair<String, Integer> u2 = new Pair<>("MS Word", 101);
		
		Pair<String, Integer> u3 = new Pair<>();
		u3.setKey("Power Point");
		u3.setVal(103);		
		
		Set<Pair<String, Integer>> s1 = new HashSet<>();
		
		s1.add(u3);
		s1.add(u2);
		s1.add(u1);
		
		System.out.println(s1);
		
		boolean  res = compare(u1, u2);
		
		System.out.println(res);
	}
	
	public static <T, U> boolean compare(Pair<T,U> p1, Pair<T,U> p2) {
		
		if(p1.getKey().equals(p2.getKey()) && p1.getVal().equals(p2.getVal())) {
			return true;
		}else {
			return false;
		}
	}

}
