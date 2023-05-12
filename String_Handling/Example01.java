package String_Handling;
import java.util.Scanner;

//Get a string from user and find the sum of the numbers in the string

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		   int sum=0;
//		   for (int i = 0; i < s.length(); i++) {
//		      if(Character.isDigit(s.charAt(i))) 
//		      sum=sum+Character.getNumericValue(s.charAt(i));
//		      }
//		   System.out.println("Sum of all the digit present in String : "+sum);
		
		String s1="Hello67";
		int sum=0;
		byte[] arr=s1.getBytes();
		for(byte b : arr) {
			if(b>=48 && b<=57) {
				int x;
				x=Integer.parseInt(""+(char)b);
				sum=sum+x;
				
			}
		}
		System.out.println(sum);
		  }
	}


