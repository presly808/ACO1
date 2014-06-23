package week3.day2.interf;

public class Student implements IStudentBehavior {

	@Override
	public void study(int hours) {
		System.out.println("Studying");
		
	}

	@Override
	public void sleep(int hours) {
		System.out.println("Sleeping");
		
	}
	
}
