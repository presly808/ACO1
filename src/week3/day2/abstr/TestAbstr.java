package week3.day2.abstr;

public class TestAbstr {
	
	
	public static void main(String[] args) {
		Machine m = new Bicycle(2000, "suzuki", "sport", 300);
		m.move();
	}
}
