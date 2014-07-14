package week5.day2.struct;

public class Outher {

	private static String desc;
	
	void action(){
		new Nested().seq = "some";
	}
	
	public static class Nested {
		private String seq = desc;
	}
	
}
 