package Control_Structure;

import java.util.Scanner;

public class ei_greaterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three numbers as A,B,C:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((a > b) && (a > c)) {
			System.out.println("A is greater");
		} else if ((b > a) && (b > c)) {
			System.out.println("B is greater");
		} else {
			System.out.println("C is greater");
		}

	}

}
