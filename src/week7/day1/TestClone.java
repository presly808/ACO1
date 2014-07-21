package week7.day1;

import week7.day1.clone.Saler;

public class TestClone {
	public static void main(String[] args) {
		Saler s = new Saler("Valia", 40, 10, "Pekarnia");
		System.out.println(s);
		Saler cloned = (Saler) s.serialClone();
		System.out.println(cloned);
		
		
	}
}
