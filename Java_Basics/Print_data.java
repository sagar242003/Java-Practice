package Java_Basics;
import java.util.Scanner;
public class Print_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Id;
		float Marks;
		String Name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id,Name,Marks ");
		Id=sc.nextInt();
		Name=sc.next();
		Marks=sc.nextFloat();
		
		
		System.out.println("The Id is "+Id);
		System.out.println("The Name is "+Name);
		System.out.println("The Marks is "+Marks);

	}

}
