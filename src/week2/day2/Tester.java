package week2.day2;

public class Tester extends Employee {

	private String type;
	
	public Tester(){
		super();
		System.out.println("IN Tester Const");
	}
	
	public Tester(String name, int age, double salary, String type){
		super(name, age, salary);
		this.type = type;
	}
	
	public void test(){
		showInfo();
		System.out.println("I'm testing");
	}
	
	
	
}
