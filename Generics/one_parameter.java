package Generics;

class sayhello<T>{
	T i;
	sayhello(){
		System.out.println("This is constructor");
	}
	void show(T x) {
		i=x;
		System.out.println("Hello this is Generics");
		System.out.println(i);
		System.out.println(i.getClass().getName());
	}
	
}
public class one_parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayhello<Integer> ob=new sayhello();
		ob.show(10);
		
		sayhello<Double> ob2=new sayhello();
		ob2.show(8.2);
		
	}

}
