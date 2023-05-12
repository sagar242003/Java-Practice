package Polymorphism;


class Animal {
	  public void Sound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public void Sound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void Sound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
public class Poly_Example03 {
	public static void main(String[] args) {
	
	Animal myAnimal = new Animal();  
    Animal myPig = new Pig();  
    Animal myDog = new Dog();  
    myAnimal.Sound();
    myPig.Sound();
    myDog.Sound();
	}
}
