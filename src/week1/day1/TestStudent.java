package week1.day1;


public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student(); // create and link
		st1.name = "Vova"; // set name
		st1.age = 24; //set age
		st1.phone = "233-45-67"; // set phone
		
		Address ad1 = new Address(); //creation
		ad1.city = "Kyiv";
		ad1.street = "Industrialna";
		ad1.houseNum = 56;
		
		st1.address = ad1;
		
		// call method which depends on object
		st1.hello(); 
		
		Student st2 = new Student();
		st2.name = "Alex";
		st2.age = 22;
		st2.phone = "123-55-87";
		
		st2.address = ad1;
		
		st2.hello();
	}

}
