package Java_Basics;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		A=sc.nextInt();
		B=sc.nextInt();
		
		int C=A*B;
		System.out.println("The Multiplication is "+C);

	}

}
