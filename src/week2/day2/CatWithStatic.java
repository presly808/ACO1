package week2.day2;

public class CatWithStatic {
	
	private String petName;
	private int age;
	private static String home;
	
	public CatWithStatic(String petName, int age) {
		super();
		this.petName = petName;
		this.age = age;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void nonStaticM(){
		petName = "Murchick";
		home = "Kiev";
	}
	
	public static void staticM(){
		home = "Odessa";
	}
	
	
	

}
