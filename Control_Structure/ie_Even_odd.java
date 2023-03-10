package Control_Structure;
import java.util.Scanner;
public class ie_Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		if(x%2==0) {
			System.out.println("The number is EVEN number");
		}
		else {
			System.out.println("THe number is ODD number");
		}

	}

}
