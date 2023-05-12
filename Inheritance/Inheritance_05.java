package Inheritance;

class A4{
	int i;
	A4(){
		i=10;
		System.out.println("constructor without arguments ");
	}
	A4(int x){
		i=x;
		System.out.println("constructor with argument");
		System.out.println(x);
	}
}
class B4 extends A4{
	int i;
	B4(){
		super(100);			//if we comment this line automatically the constructor without argument constructor called
		i=20;
		System.out.println("In B");
	}
	void add(){
		System.out.println(i+super.i);
	}
}
public class Inheritance_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B4 t1=new B4();
		t1.add();

	}

}
