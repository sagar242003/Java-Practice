package Control_Structure;
import java.util.Scanner;
public class ie_Quadratic_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coefficients of the quadratic equation:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int r1= b*b-4*a*c;
		int r2= b*b-4*a*c;
		
		if(r1>0 && r2>0) {
			System.out.println("the roots are real");
		}else {
			System.out.println("the roots are imaginary");
		}

	}

}
