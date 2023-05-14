package Collection_Framework;
import java.util.*;
public class Queue_LinkedList_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> c = new LinkedList<>();

		c.offer(10);
		c.offer(50);
		c.offer(30);
		
		//list print in unordered manner or as per the input given by the user
		System.out.println(c);
		
		//peek in queue means the first element in the list
		int p=c.peek();
		System.out.println(p);
		
		//using poll method the upper element is get deleted or removed
		//c.poll();
		c.poll();
		System.out.println(c);

	}

}
