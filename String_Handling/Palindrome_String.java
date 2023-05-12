package String_Handling;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String rev="";
		String s1 = sc.next();
		
		char[] ch1=s1.toCharArray();
		
		 for(int i=s1.length()-1;i>=0;i--) {
			 rev=rev+s1.charAt(i);
		 }
		 if(s1.equals(rev)) {
			 System.out.println("It is Palindrome String");
		 }
		 else {
			 System.out.println("It is not a palindrome String");
		 }
	}

}
