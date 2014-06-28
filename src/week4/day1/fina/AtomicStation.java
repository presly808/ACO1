package week4.day1.fina;

public final class AtomicStation {
	
	// Has been initialized in constructor or near field
	private final int temperature;
	private static final int WEEK_DAYS = 7; 
	
	
	public AtomicStation(int temperature) {
		super();
		this.temperature = temperature;
	}

	// Can not override final method
	public final void start(){
		System.out.println("Starting station");
	}

	public void action(){
		
	}
	
}

class FakeStation {
	
	
}

class MainTest {
	
	public static void main(String[] args) {
		
	}
	
	public static void testAtomicStation(AtomicStation station){
		station.start();
	}
	
}


