package String_Handling;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String rev="";
		String s1 = sc.next();
		
		char[] ch1=s1.toCharArray();
		
		 for(int i=s1.length()-1;i>=0;i--) {
			 rev=rev+s1.charAt(i);
		 }
		 System.out.println(rev);

	}

}
