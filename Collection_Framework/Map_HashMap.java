package Collection_Framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Map_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> ob = new HashMap<>();

		ob.put(1, "xyz");
		ob.put(2, "abc");
		ob.put(19, "qqq");
		ob.put(19, "pqr");
		// ob.put(18, "pqr");

		// putIfAbsent(Keyset,value) is used if we want to add data and don't want to
		// override
		// ob.putIfAbsent(11,"ijk");

		// if the key value is repeating then the last value is considered
		System.out.println(ob);

		// get all keys
		System.out.println("All the keys");
		Set<Integer> keys = ob.keySet();

		for (Integer k : keys) {

			System.out.println(k);

		}
		
		System.out.println("OR");
		System.out.println();
		
		for (Integer K : ob.keySet()) {
			System.out.println(K);
		}

		// get all values
		System.out.println("Get all Values");
		System.out.println();

		Collection<String> myvalues = ob.values();

		for (String m : myvalues) {

			System.out.println(m);

		}
		
		System.out.println("OR");
		System.out.println();
		
		for (String M : ob.values()) {
			System.out.println(M);
		}
	}

}
