package JavaCLass;

/**
 * 
 * this vs super String color = "white";
 * 
 * String color = "black";
 * 
 * void printColor() { System.out.println("prints color of Dog class :- "+
 * color);// prints color of Dog class System.out.println("prints color of
 * Animal class :-"+super.color);// prints color of Animal class }
 * 
 * public static void main(String args[]) { // object of child class Dog d = new
 * Dog(); d.printColor(); }
 * 
 * 
 * 
 * void eat() { System.out.println("eating..."); }
 * 
 * 
 * 
 * void eat() { System.out.println("eating bread..."); }
 * 
 * void bark() { System.out.println("barking..."); }
 * 
 * void work() { eat(); super.eat(); bark(); }
 * 
 * 
 * public static void main(String args[]) { Dog d = new Dog(); d.work(); }
 * 
 * constructor:- a methods which has same name as like class
 * and which does not have a return type
 *
 *  cosntructor is use for creating an object with the help of default construcotr
 *  
 *  which brings you the type of constructor :-
 *  1) default construcotor
 *  2) parametrize constructor
 *  
 *  Note:- whenever user create an object by default compilor calles the default constructor
 *  weather you define constructor or not in ther respective class.
 *
 */
//parent class
public class Animal {
	Animal() {
		System.out.println("animal is created");
	}

}

//child class
class Dog extends Animal {
	Dog(){  
		super();  
		System.out.println("dog is created");  
		}  
	Dog(String str){
		System.out.println(str);
	}
	
}

//normal calling class
class TestSuper1 {
	public static void main(String args[]){  
		//cosntructor is use for creating an object with the help of default constructor0
		Dog d=new Dog();
		new Dog("dasdasdasd");
		}
}
