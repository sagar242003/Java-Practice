package Inheritance;

// Adding variables to inheritance

class A2{
	int i;
	A2(){
		i=10;
		System.out.println("In A");
	}
}
class B2 extends A2{
	int j;
	B2(){
		j=20;
		System.out.println("In B");
	}
	void addi(){
		System.out.println(i+j);
	}
}

public class Inheritance_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 t1=new B2();
		t1.addi();

	}

}
