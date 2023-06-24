package Loops;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you wanrt to convert into binary: ");
		int n = sc.nextInt();
		int i = 0;
		while (n > 0) {

			arr[i] = n % 2;
			n = n / 2;
			i++;
		}
		System.out.println("The number of times the loop runs: " + i);
		
		System.out.println("The binary number is :");
		while (i >= 0) {

			System.out.print(arr[i]);
			i--;
		}
	}

}
