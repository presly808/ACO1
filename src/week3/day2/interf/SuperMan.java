package week3.day2.interf;

public class SuperMan implements IStudentBehavior, IWorkerBehavior {

	@Override
	public void work() {
		System.out.println("SuperMan working");
	}

	@Override
	public void study(int hours) {
		System.out.println("SuperMan studying");
		
	}

	@Override
	public void sleep(int hours) {
		System.out.println("SuperMan sleeping");
		
	}
	
}
