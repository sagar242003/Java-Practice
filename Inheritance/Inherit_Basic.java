package Inheritance;

class A{
	void show() {
		System.out.println("In Base");
	}
}
class B extends A{
	void disp() {
		System.out.println("In derived !!!");
	}
}

public class Inherit_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob = new B();
		ob.show();
		ob.disp();

	}

}
