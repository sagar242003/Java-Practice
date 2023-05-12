package Polymorphism;

class X{
	void show() {
		System.out.println("In X");
	}
}
class Y extends X{
	void show() {
		System.out.println("In B");
	}
}
public class Poly_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y ob1=new Y();
		ob1.show();
		

	}

}
