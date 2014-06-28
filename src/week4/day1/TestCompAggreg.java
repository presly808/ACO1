package week4.day1;

public class TestCompAggreg {

	public static void main(String[] args) {

		// Aggregation
		Table table = new Table();
		Room room = new Room(table);
		
		room = null;
		
		
		//Composition
		Room room2 = new Room(new Table());
		room2 = null;
		
	}

}
