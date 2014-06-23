package week3.day2.abstr;

public class Bicycle extends Machine {

	private String type;
	private int speed;
	
	public Bicycle(double weight, String model, String type, int speed) {
		super(weight, model);
		this.speed = speed;
		this.type = type;
	}

	@Override
	public void move() {
		System.out.println("Bicycle is moving");
	}
	
}
