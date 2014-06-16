package week2.day2;

public class Coder extends Employee {

	public Coder() {
		super();
	}

	public Coder(String name, int age, double salary) {
		super(name, age, salary);
	}
	
	public void code(){
		showInfo();
		System.out.println("Im coding");
	}
	
	public void work(){
		System.out.println("Coder is working");
	}
	
	public String toString() {
		return "name=" + getName() + " age=" + getAge()+ " salary=" + getSalary();
	}
	
}
