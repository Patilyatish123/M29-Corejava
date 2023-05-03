package org.tnsif.constructoroverloading;

public class ConstructorOverloadingExample {
	private int x;
	private int y;
	
	
public ConstructorOverloadingExample() {
	System.out.println("Default constructor");
}
public ConstructorOverloadingExample(int x) {
	System.out.println("Parametrized constructor"+x);
}
public ConstructorOverloadingExample(int x, int y) {
	System.out.println("Default constructor" +x +y);
}
}
