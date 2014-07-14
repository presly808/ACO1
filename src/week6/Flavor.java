package week6;

import java.io.Serializable;

public class Flavor{
	private String name;
	
	public Flavor(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Flavor [name=" + name + "]";
	}
	
	
	
	

}
