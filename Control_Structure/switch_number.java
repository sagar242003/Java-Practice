package Control_Structure;
import java.util.Scanner;
public class switch_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float a,b;
		System.out.println("Enter any two numbers :");
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Enter the sign of the operation you want to perform(+,-,*,/): ");
		
		
		char x=sc.next().charAt(0);
		
		switch(x) {
		
		case '+':
			System.out.println("The addition is "+(a+b));
			break;
			
		case '-':
			System.out.println("The subtraction is "+(a-b));
			break;
			
		case '*':
			System.out.println("The multiplication is "+(a*b));
			break;
			
		case '/':
			System.out.println("The division is "+(a/b));
			break;
			
		default:
			System.out.println("wrong choice");
			
			
		}
		

	}

}
