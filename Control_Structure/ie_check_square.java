package Control_Structure;
import java.util.Scanner;

class ie_check_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Length,Breadth;
		System.out.println("Enter the length and breadth:");
		Scanner sc=new Scanner(System.in);
		Length=sc.nextInt();
		Breadth=sc.nextInt();
		
		if(Length == Breadth) {
			System.out.println("It is a square");
		}
		else {
			System.out.println("It is not a square");
		}
		System.out.println("The Area is  "+(Length*Breadth));

	}

}
