package week2.day1;

public class Car {
	
	private String model;
	private int speed;
	private String color;
	private String[] techList;
	private double price;
	private Car additional;
	
	
	private void testPriv(){
		additional = this; // Car this
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	
}

