package Polymorphism;

class P{
	void shoow() {
		System.out.println("In P");
	}
}
class Q{
	void shoow() {
		System.out.println("In Q");
	}
}
class R{
	void shoow() {
		System.out.println("In R");
	}
}
public class Poly_Runtime_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P ob1=new P();
		Q ob2=new Q();
		R ob3=new R();
		
		P r;
		r=ob1;
		r.shoow();
		
		Q r1;
		r1=ob2;
		r1.shoow();

		R r2;
		r2=ob3;
		r2.shoow();
		
		

	}

}
