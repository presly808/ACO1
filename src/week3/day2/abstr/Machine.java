package week3.day2.abstr;


// Can not create instance of AClass
// Has abstract and non-abstract methods
// Has constructors
// Use for flexible architecture
// Rule of OOP : Depend on abstraction 
public abstract class Machine {

	private double weight;
	private String model;
	
	public Machine(double weight, String model) {
		super();
		this.weight = weight;
		this.model = model;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	// define method signature
	public abstract void move();
	
	
	
}
