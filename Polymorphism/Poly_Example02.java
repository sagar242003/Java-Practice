package Polymorphism;

class Student{
	private int id;
	private String name;
	public Student(int id,String name) {
		super();
		this.id=id;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "["+id+" "+name+"]";
	}
	
}
public class Poly_Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(100,"abc");
		System.out.println(st.toString());
		System.out.println(st); 

	}

}
