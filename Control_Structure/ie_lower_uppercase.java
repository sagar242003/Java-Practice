package Control_Structure;
import java.util.Scanner;

public class ie_lower_uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any character :");
		Scanner sc=new Scanner(System.in);
		char A=sc.next().charAt(0);
		
		if((int)(A)>=65 && (int)(A)<=90) {
			System.out.println("It is upper case");
		}else {
			System.out.println("It is lower case ");
		}

	}

}
