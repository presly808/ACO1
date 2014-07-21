package week7.day1;

public class TestStaticPoly {
	
	public static void main(String[] args) {
		Parent p = new Child();
		
		p.foo();
	}
}

class Parent {
	
	
	public static void foo(){
		System.out.println("Parent foo");
	}
	
	
}

class Child extends Parent {
	
	
	public static void foo(){
		System.out.println("child foo");
	}
	
}

