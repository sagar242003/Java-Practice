package Loops;
import java.util.Scanner;
public class while_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of stars you want to print: ");
		Scanner sc=new Scanner(System.in);
//		int a=5;
//		int i=0;
//		int j=0;
//		while(i<a) {
//			while(j<a) {
//			System.out.println(" * ");
//			j++;
//		}
//			i++;
//		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			}
		for(int i=5;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
			
			}

	}

}
