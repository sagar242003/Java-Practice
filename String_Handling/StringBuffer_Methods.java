package String_Handling;
import java.lang.*;
public class StringBuffer_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello World");

		// Length of StringBuffer
		int x = sb.length();
		System.out.println(x);

		// Capacity of StringBuffer capacity of sb is 16 bytes default but it can
		// changed during runtime
		System.out.println(sb.capacity());
		
		//replacing the character in the given index
		sb.setCharAt(0, 'h');
		System.out.println(sb);
		
		//append (add the data to the end of StringBuffer
		sb.append("hi");
		sb.append(5);
		System.out.println(sb);
		
		//delete the particular ranges of index
		sb.delete(0,6);
		System.out.println(sb);
		
		//delete the particular character
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		StringBuffer sb2=new StringBuffer("Hello");
		
		//reverse the string
		sb2.reverse();
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer("Hello");
		
		//Insert the string
		sb3.insert(5, " World");
		System.out.println(sb3);
		

	}

}
