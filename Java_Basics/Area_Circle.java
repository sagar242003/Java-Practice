package Java_Basics;

import java.util.Scanner;

public class Area_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A;
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle");
		
		r=sc.nextInt();
		
		A=2*3.14*r*r;
		System.out.println("The Area of Circle is "+A);

	}

}
