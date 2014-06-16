package week2.day2;

public class TestCompany {

	public static void main(String[] args) {
		Tester t = new Tester("Vova", 24, 2000, "A");
		Coder c = new Coder("Alex", 26, 2500);
		Employee em = new Employee("Serhi", 26, 40009);
		
		System.out.println("toString");
		System.out.println(c);
		System.out.println();
		
		Employee em1 = testCast(t);
		Employee em2 = testCast(c);
		Employee em3 = testCast(em);
	}
	
	public static Employee testCast(Employee empl){
		if(empl instanceof Tester){
			System.out.println("This is tester");
			
			Tester t = (Tester) empl;
			t.test();
			
			return t;
		} else if(empl instanceof Coder){
			System.out.println("This is Coder");
			
			Coder c = (Coder) empl;
			c.code();
			
			return c;
		} else {
			System.out.println("This is employee");
			
			return empl;
		}
		
	}

}
