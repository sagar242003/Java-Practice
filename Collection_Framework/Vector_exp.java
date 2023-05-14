package Collection_Framework;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

public class Vector_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v);

		Enumeration<Integer> e1 = v.elements();
		while (e1.hasMoreElements()) {

			Integer x = e1.nextElement();
			System.out.println(x);
		}

		System.out.println();

		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {

			Integer y = it.next();
			System.out.println(y);
		}

	}

}
