//Write the program of Addition of two numbers (take input from user)

package Java_Basics;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int A,B;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		A=sc.nextInt();
		B=sc.nextInt();
		
		int C=A+B;
		System.out.println("The addition is "+C);

	}

}
