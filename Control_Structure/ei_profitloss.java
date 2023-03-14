package Control_Structure;
import java.util.*;
public class ei_profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the selling price and cost price:");
		Scanner sc=new Scanner(System.in);
		int Sp=sc.nextInt();
		int Cp=sc.nextInt();
		
		if((Sp-Cp)>0) {
			System.out.println("Profit");
		}else if((Sp-Cp)<0) {
			System.out.println("Loss");
		}else {
			System.out.println("No Loss No Profit");
		}
		

	}

}
