package week1.day1;

public class Address {
	
	String city;
	String street;
	int houseNum;
	
	public void showAdd(){
		System.out.println("City : " + city +
							", street : " + street + 
							", HouseNum : " + houseNum);
	}
	
	public void changeCity(String newCity){
		city = newCity;
	}
	
}
