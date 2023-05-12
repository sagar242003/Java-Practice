package Polymorphism;

class overload{
	void add(int x,int y) {
		System.out.println("Integer addition");
		System.out.println(x+y);
	}
	void add(float x,float y) {
		System.out.println("Float Called");
		System.out.println(x+y);
	}
	void add(String x,String y) {
		System.out.println("String called");
		System.out.println(x+y);
	}
}
public class Poly_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload ov1=new overload();
		ov1.add(100, 200);
		
		System.out.println();
		
		ov1.add(1.2f, 2.2f);
		
		System.out.println();
		
		ov1.add("Hello", " World");
		

	}

}
