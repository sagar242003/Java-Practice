package Inheritance;
		// Here we given the how the constructor works in Inheritance
class A1{
	A1(){
		System.out.println("In A");
	}
}
class B1 extends A1{
	B1(){
		System.out.println("In B");
	}
}
class C extends B1{
	C(){
		System.out.println("In C");
	}
}
public class Inheritance_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob=new C();

	}

}
