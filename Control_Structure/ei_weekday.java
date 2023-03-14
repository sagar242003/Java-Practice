package Control_Structure;
import java.util.Scanner;
public class ei_weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of the day:");
		int A;
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		
		if(A==1) {
			System.out.println("The day is Monday");
		}else if(A==2) {
			System.out.println("The day is Tuesday");
		}else if(A==3) {
			System.out.println("The day is Wednesday");
		}else if(A==4) {
			System.out.println("The day is Thursday");
		}else if(A==5) {
			System.out.println("The day is Friday");
		}else if(A==6) {
			System.out.println("The day is Saturday");
		}else if(A==7) {
			System.out.println("The day is Sunday");
		}

	}

}
