package week4.day2;

public class TestComparator {

	public static void main(String[] args) {
		Airplane plane1 = new Airplane("SU-34", 1200, AirplaneType.MILITARY);
		Airplane plane2 = new Airplane("AN-60", 900, AirplaneType.PASSANGER);
		
		AirplaneTypeComparator comp = new AirplaneTypeComparator();
		
		System.out.println(comp.compare(plane1, plane2));
		
	}
	
}
