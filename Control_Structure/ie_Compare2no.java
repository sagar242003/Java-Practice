package Control_Structure;

import java.util.Scanner;

public class ie_Compare2no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		System.out.println("Enter any two number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		if(x>y) {
			System.out.println(x+" is greater than "+y);
		}
		else {
			System.out.println(y+" is greater than "+x);
		}

	}

}
