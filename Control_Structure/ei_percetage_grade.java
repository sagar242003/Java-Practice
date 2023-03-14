package Control_Structure;
import java.util.Scanner;
public class ei_percetage_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float m1,m2,m3,m4,m5;
		System.out.println("Enter the marks of five subjects:");
		Scanner sc=new Scanner(System.in);
		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
		m4=sc.nextFloat();
		m5=sc.nextFloat();
		
		float total=m1+m2+m3+m4+m5;
		double p=total*0.2;
		
		if(p>=90) {
			System.out.println("Grade A");
		}else if(p>=80) {
			System.out.println("Grade B");
		}else if(p>=70) {
			System.out.println("Grade C");
		}else if(p>=60) {
			System.out.println("Grade D");
		}else if(p>=50) {
			System.out.println("Grade E");
		}else if(p>=40) {
			System.out.println("Grade F");
		}

	}

}
