package week3.day2.interf;

// IWorkerBehavior w = new Worker();
public class Worker implements IWorkerBehavior {

	@Override
	public void work() {
		System.out.println("Worker is working");
	}
	
}
