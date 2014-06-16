package week2.day2;

// Shift + Alt + S
public class Employee {

	private String name;
	private int age;
	private double salary;
	private int count;
	
	{
		count++;
	}
	
	public Employee() {
		System.out.println("In Employee constr");
	}
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void showInfo(){
		System.out.println("name : " + name + " age : " + age +" salary : " + salary);
	}
	
	public void work(){
		System.out.println("Employee is working");
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(this == obj){
			return true;
		}
		
		if(!(obj instanceof Employee)) {
			return false;
		}
		
		Employee other = (Employee) obj;
		
		if(name.equals(other.getName()) && age == other.getAge() 
										&& salary == other.getSalary()){
			return true;
		}
		
		return false;
	}
	
	

}
