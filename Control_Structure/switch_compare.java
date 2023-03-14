package Control_Structure;
import java.util.*;

public class switch_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		System.out.println("Enter any numbers:");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		//y = sc.nextInt();

		switch (x%2) {

		case 0:
			System.out.println("The given number is even number ");
			break;

		case 1:
			System.out.println("The given number is odd number ");
			break;

		}

	}

}
