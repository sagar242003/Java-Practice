package Loops;
import java.util.Scanner;
public class wh_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		i=1;
		int a;
		System.out.println("Enter the number you want add upto:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(i<=a) {
			sum=sum+i;
			i++;
		}
		System.out.println("The addition is "+sum);

	}

}
