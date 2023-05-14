package Collection_Framework;

import java.util.*;

public class TreeSet_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> T = new TreeSet<>();

		T.add(10);
		T.add(20);
		T.add(30);
		//Whatever be the sequence in the given tree it will always give the sorted output
		//Bigger number is present in the RHS of first number(Node) 
		//Smaller number is present in the LHS of first number(Node) 
		System.out.println(T);
		
		System.out.println(T.size());
		System.out.println(T.contains(20));
		
		T.clear();
		//It clears the given list makes it empty
		System.out.println(T);
		
		System.out.println("#####################################");
		
		TreeSet<Integer> T2 = new TreeSet<>();

		T2.add(10);
		T2.add(20);
		T2.add(30);
		T2.add(10);
		
		//Number 10 is not get repeated in the list because in the any set no value is get repeated
		System.out.println(T2);

	}

}
