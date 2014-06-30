package week4.day2;

public class Airplane implements Comparable<Airplane> {

	private String model;
	private int speed;
	private AirplaneType type;
	
	public Airplane(String model, int speed, AirplaneType type) {
		super();
		this.model = model;
		this.speed = speed;
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public AirplaneType getType() {
		return type;
	}

	public void setType(AirplaneType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Airplane [model=" + model + ", speed=" + speed + ", type="
				+ type + "]";
	}

	@Override
	public int compareTo(Airplane o) {
		return this.speed - o.speed;
	}
	
	

}
