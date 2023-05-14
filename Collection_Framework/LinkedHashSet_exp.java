package Collection_Framework;

import java.util.*;

public class LinkedHashSet_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> Lh1 = new LinkedHashSet<>();

		Lh1.add(10);
		Lh1.add(20);
		Lh1.add(30);
		
		//It prints the HashSet in the ordered manner 
		System.out.println(Lh1);
		
		System.out.println(Lh1.size());
		System.out.println(Lh1.contains(20));
		
		Lh1.clear();
		//It clears the given list makes it empty
		System.out.println(Lh1);
		
		System.out.println("##############################################");
		
		LinkedHashSet<Integer> Lh2 = new LinkedHashSet<>();

		Lh2.add(10);
		Lh2.add(20);
		Lh2.add(30);
		Lh2.add(10);
		
		//Number 10 is not get repeated in the list because in the any set no value is get repeated
		System.out.println(Lh2);

	}

}
