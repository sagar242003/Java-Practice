package Collection_Framework;
import java.util.*;
public class Array_Dequeue_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		
		ad.add(10);
		ad.add(20);
		ad.add(30);

		System.out.println(ad);

		ad.addFirst(90);
		System.out.println(ad);

		ad.addLast(80);
		System.out.println(ad);

		ad.remove(2);
		System.out.println(ad);

		ad.removeFirst();
		System.out.println(ad);

		ad.removeLast();
		System.out.println(ad);

		System.out.println(ad.size());

	}

}
