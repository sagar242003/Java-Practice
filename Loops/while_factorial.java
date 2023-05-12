package Loops;
import java.util.Scanner;
public class while_factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter the number you want to calculate the factorial :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int fact=1;
		int i=1;
		
		while(i<=a) {
			fact=fact*i;
			i++;
		}
		System.out.println("the factorial of given number is "+fact);

	}

}
