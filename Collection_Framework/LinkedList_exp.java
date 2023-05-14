package Collection_Framework;
import java.util.*;
public class LinkedList_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println(list);

		list.addFirst(90);
		System.out.println(list);

		list.addLast(80);
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

		System.out.println(list.size());
		
		System.out.println("###########################################################");

		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(20);
		list1.add(40);
		list1.add(60);
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) {
			
			System.out.println(list1.get(i));
			
		}

	}

}
