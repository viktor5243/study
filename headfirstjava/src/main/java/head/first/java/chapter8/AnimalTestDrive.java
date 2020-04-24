package main.java.head.first.java.chapter8;

public class AnimalTestDrive {
	
	public static void main (String[] args) {
		MyAnimalList list = new MyAnimalList();
		
		Animal a = new Dog();
		Animal c = new Cat();
		
		list.add(a);
		list.add(c);
	}
	
}
