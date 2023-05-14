package Collection_Framework;

import java.util.*;
public class Stack_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		
		// peek method prints the last member of the list
		int d=st.peek();
		System.out.println(d);
		
		//search method is used to find the index of the entered member of the list
		int x=st.search(20);
		System.out.println(x);
		
		//using pop method the last element is get deleted(remove by pop)
		st.pop();
		System.out.println(st);

		//check whether the stack is empty or not
		boolean s=st.isEmpty();
		System.out.println(s);
		//System.out.println(st.isEmpty());
		
		//###########################################################################
		System.out.println();
		Stack<Integer> st2=new Stack<>();
		
		st2.push(100);
		st2.push(200);
		st2.push(300);
		
		System.out.println(st2);
		
		st2.pop();
		st2.pop();
		st2.pop();
		System.out.println(st2);
		
		boolean s1=st2.isEmpty();
		System.out.println(s1);
	}
}
