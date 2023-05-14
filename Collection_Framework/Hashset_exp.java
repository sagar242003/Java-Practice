package Collection_Framework;

import java.util.*;

public class Hashset_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h1 = new HashSet<>();

		h1.add(10);
		h1.add(20);
		h1.add(30);
		
		//values arranges according to hash values(hashcodes) they are not in order.
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.contains(20));
		
		h1.clear();
		//It clears the given list makes it empty
		System.out.println(h1);
		
		System.out.println("##############################################################");

		
		HashSet<Integer> h2 = new HashSet<>();

		h2.add(10);
		h2.add(20);
		h2.add(30);
		h2.add(10);
		
		//Number 10 is not get repeated in the list because in the any set no value is get repeated
		System.out.println(h2);
		

	}

}
