package week5.day1;

public class EntityWithStatic {
	int age;
	String name;
	
	static int count;
	
	public void showInfo(){
		age++;
		name = "Alex";
	}
	
	public static void action(){
		count++;
	}
	
}
