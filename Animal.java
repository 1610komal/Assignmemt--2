package assign2;


//Create a superclass Animal
class Animal2{
	 public void makeSound() {
		 System.out.println(" The Animals make a sound");
	 }
}


class Dog extends Animal2{
	 public void makeSound() {
		 System.out.println(" The Dog barks");
	 }
}

class Cat extends Animal2{
	@Override
	 public void makeSound() {
		 System.out.println(" The Cat meaws");
	 }
}

//Main class
public class Animal {

	public static void main(String[] args) {
		//create object of each class
		
		Animal2 obj1 = new Cat();
		Animal2 obj2 = new Dog();
		obj1.makeSound();
		obj2.makeSound();

	}

}
