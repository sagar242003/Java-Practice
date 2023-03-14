package Control_Structure;
import java.util.Scanner;

public class ei_DaysinMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of month :");
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		System.out.println("Enter the year :");
		int B=sc.nextInt();
		
		 if(A%2 != 0) {
			System.out.println("31 Days");
		}else if((A==2) && (B%4 ==0)) {
			System.out.println("29 days");
		}else if((A==2) && (B%4 !=0)) {
			System.out.println("28 days");
		}else if(A%2 == 0) {
			System.out.println("30 Days");
		}

	}

}
