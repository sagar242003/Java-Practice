package Collection_Framework;

import java.util.*;
//import java.util.ArrayList;
//import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar4 = new ArrayList();

		ar4.add(20);
		ar4.add(40);
		ar4.add(60);

		System.out.println();
		// Iterator
		System.out.println(" forward direction only");

		java.util.Iterator<Integer> it = ar4.iterator();
		
		//it is the interface in java we can traverse only in forward direction

		while (it.hasNext()) {
			Integer y = (Integer) it.next();
			System.out.println(" " + y);
		}

		System.out.println();
		System.out.println(" By using ListIterator");

		ListIterator<Integer> it2 = ar4.listIterator();
		
	//it is the interface that extends in iterator interface traverse in forward as well backward direction

		System.out.println(" Forward........");

		while (it2.hasNext()) {
			Integer y1 = it2.next();
			System.out.println(" " + y1);
		}

		System.out.println();
		System.out.println(" Backward........");

		while (it2.hasPrevious()) {
			Integer y1 = it2.previous();
			System.out.println(" " + y1);
		}

	}

}
