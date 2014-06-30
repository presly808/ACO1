package week4.day2;

import java.util.Comparator;

public class AirplaneTypeComparator implements Comparator<Airplane>{

	@Override
	public int compare(Airplane o1, Airplane o2) {
		return o1.getType().compareTo(o2.getType());
	}

	
	
}
