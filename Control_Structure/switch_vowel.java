package Control_Structure;
import java.util.*;
public class switch_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any character :");
		Scanner sc=new Scanner(System.in);
		char x=sc.next().charAt(0);
		switch(x) {
		

		case 'A':
			System.out.println("It is Vowel");
			break;
		case 'E':
			System.out.println("It is Vowel");
			break;
		case 'I':
			System.out.println("It is Vowel");
			break;
		case 'O':
			System.out.println("It is Vowel");
			break;
		case 'U':
			System.out.println("It is Vowel");
			break;
		case 'a':
			System.out.println("It is Vowel");
			break;
		case 'e':
			System.out.println("It is Vowel");
			break;
		case 'i':
			System.out.println("It is Vowel");
			break;
		case 'o':
			System.out.println("It is Vowel");
			break;
		case 'u':
			System.out.println("It is Vowel");
			break;
		default:
			System.out.println("It is Consonent");	
		}

	}

}
