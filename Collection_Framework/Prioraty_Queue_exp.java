package Collection_Framework;
import java.util.*;
public class Prioraty_Queue_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//use of priority queue is to implement the heap
		//we are having 2 type(min and max) heap and here we are using min heap
		
		
		Queue<Integer> c = new PriorityQueue<>();

		c.offer(10);
		c.offer(50);
		c.offer(30);
		c.offer(29);
		c.offer(77);
		c.offer(200);
		
		//list print in unordered manner or as per the input given by the user
		System.out.println(c);
		
		//peek in queue means the first element in the list
		int p=c.peek();
		System.out.println(p);
		
		//using poll method the upper element is get deleted or removed
		//c.poll();
		c.poll();
		System.out.println(c);

		
		System.out.println("#########################################################");
		
		//now it will print max heap
		Queue<Integer> c1= new PriorityQueue<>(Comparator.reverseOrder());

		c1.offer(10);
		c1.offer(50);
		c1.offer(30);
		c1.offer(29);
		c1.offer(77);
		c1.offer(200);
		
		//list print in unordered manner or as per the input given by the user
		System.out.println(c1);
	}

}
