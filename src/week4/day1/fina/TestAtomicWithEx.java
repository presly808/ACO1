package week4.day1.fina;

import week4.day2.except.DangerTemperatureException;

public class TestAtomicWithEx {

	public static void main(String[] args) {
		AtomicStation at = new AtomicStation(80);
		
		String s = "some";
		
		
		try {
			at.start();			
		} catch (DangerTemperatureException ex){
			System.err.println(ex.getMessage());
			at.safeStop();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("After try-catch");
		
	}

}
