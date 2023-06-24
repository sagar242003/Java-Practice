package Generics;

class add<T,V>{
	T i;
	V j;
	add(T x,V y){
		i=x;
		j=y;
		System.out.println("The first argument is "+x);
		System.out.println();
		
		System.out.println("The second argument is "+y);
		System.out.println();
		
		System.out.println(i.getClass().getName()+" / "+j.getClass().getName());
		System.out.println();
	}
}
public class two_parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add<Integer,Integer> a1=new add(20,30);
		add<String,String> a2=new add("Hello","World");
	}

}
