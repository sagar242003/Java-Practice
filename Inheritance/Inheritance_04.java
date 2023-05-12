package Inheritance;

// If both the class has the variables with the same name then super keyword used
class A3{
	int i;
	A3(){
		i=10;
		System.out.println("In A");
	}
}
class B3 extends A3{
	int i;
	B3(){
		i=20;
		System.out.println("In B");
	}
	void add(){
		System.out.println(i+super.i);
	}
}
public class Inheritance_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 t1=new B3();
		t1.add();
	}

}
