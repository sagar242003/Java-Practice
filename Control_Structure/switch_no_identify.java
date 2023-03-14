package Control_Structure;
import java.util.*;
public class switch_no_identify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		System.out.println("Enter the number between 1,2 or 3 :");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		switch(c) {
		
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;	
		default:
			System.out.println("Wrong Choice");
		}
		

	}

}
