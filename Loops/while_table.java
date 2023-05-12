package Loops;
import java.util.Scanner;
public class while_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number you want table: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1,sum=0;
		while(i<=10) {
			sum=a*i;
			System.out.println(sum);
			i++;
		}
		
	}

}
