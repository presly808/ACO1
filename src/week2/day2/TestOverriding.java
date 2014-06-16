package week2.day2;

import week1.day2.Test;

public class TestOverriding {

	public static void main(String[] args) {
		Coder c = new Coder();
		c.work();

		Employee em = new Employee();
		em.work();
		
		Tester t = new Tester();
		t.work();
		
		Employee em2 = new Coder();
		em2.work();
		
	}

}
