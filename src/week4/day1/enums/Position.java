package week4.day1.enums;

public enum Position { // extends Enum
	
	JUNIOR("jun"), MIDDLE("mid"), SENIOR("sen"); // Postion JUNIOR = new Position();
	
	private final String description;
	
	private Position(String description){
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
}

class TestEnums {
	
	public static void main(String[] args) {
		Position p = Position.JUNIOR;
		//
		Position jun = Position.valueOf("JUNIOR");
		
		System.out.println(jun.name());
		System.out.println(jun.ordinal());
		System.out.println();
		
		
		
		
	}
}
