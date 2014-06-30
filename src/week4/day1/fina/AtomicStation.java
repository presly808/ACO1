package week4.day1.fina;

import java.text.ParseException;

import week4.day2.except.DangerTemperatureException;

public final class AtomicStation {
	
	// Has been initialized in constructor or near field
	private final int temperature;
	private static final int WEEK_DAYS = 7; 
	
	private final static int CRITICAL_TEMPERATURE = 60;
	
	public AtomicStation(int temperature) {
		super();
		this.temperature = temperature;
	}

	// Can not override final method
	public final void start() throws DangerTemperatureException {
		if(temperature >= CRITICAL_TEMPERATURE){
			throw new DangerTemperatureException("AHTUNG");
		} 

	}
	
	public final void safeStop(){
		System.out.println("Stoping station");
	}

	public void action(){
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("AtomicStaition is deleting");
		super.finalize();
	}
	
	
	
}

class FakeStation {
	
	
}

class MainTest {
	
	public static void main(String[] args) {
		
	}
	
	public static void testAtomicStation(AtomicStation station){
		
	}
	
}


