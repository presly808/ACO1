package week2.day2;

public class TestEmployeeEq {

	public static void main(String[] args) {
		Employee em1 = new Employee("Serh", 22, 500000);
		Employee em2 = new Employee("Serh", 22, 500000);
		
		em1.equals(em2);
		System.out.println("em1 == em2 " + (em1 == em2));
		System.out.println("em1.equals(em2)" + em1.equals(em2));
		

		int a = 20;
		int r = a < 10 ? a * 10 : a;
	}

}
