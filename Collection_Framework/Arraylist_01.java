package Collection_Framework;

import java.util.ArrayList;
public class Arraylist_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar = new ArrayList();

		System.out.println(ar.size()); // Number of elements present in an ArrayList

		// add item in the ArrayList
		ar.add(10);
		ar.add(20);
		ar.add(30);

		System.out.println(ar.size());

		System.out.println(); // addAll() is used to add all items from one collection into another collection

		ArrayList<Integer> ar1 = new ArrayList();

		ar1.add(5);
		ar1.add(10);
		ar1.add(15);

		ar.addAll(ar1);
		System.out.println(ar); // (10,20,30,5,10,15)

//		remove by index
//		ar.remove(0);
//		System.out.println(ar);		//[20, 30, 5, 10, 15]
//		ar.remove(4);
//		System.out.println(ar);		//[20, 30, 5, 10]

		// toArray() used to convert the ArrayList into the Array

		ArrayList<Integer> ar3 = new ArrayList();

		ar3.add(20);
		ar3.add(40);
		ar3.add(60);

		Integer[] arr = new Integer[ar3.size()];
		ar3.toArray(arr);

		for (Integer x : arr) {
			System.out.println(x);
		}
		
		System.out.println();
		
		System.out.println(ar1.get(2));
		
		

	}

}
