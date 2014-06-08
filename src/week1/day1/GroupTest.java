package week1.day1;

import java.util.Scanner;

public class GroupTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size");
		int size = sc.nextInt();
		Student[] hostel = new Student[size]; // default values null
		
		Address add = new Address();
		add.city = "Kiev";
		add.street = "Peremogy";
		add.houseNum = 45;
		
		for(int i = 0; i < hostel.length; i++){
			int userCount = i + 1;
			System.out.println("Input name of " + userCount + " student");
			String name = sc.next();
			
			System.out.println("Input age of " + userCount + " student");
			int age = sc.nextInt();
			
			System.out.println("Input phone of " + userCount + " student");
			String phone = sc.next();
			
			System.out.println("Input group number of " + userCount + " student");
			int groupNum = sc.nextInt();
					
			hostel[i] = new Student(name, age, phone, groupNum);
			hostel[i].address = add;
			
		}
		
		// show all
		for(int i = 0; i < hostel.length; i++){
			hostel[i].hello();
		}
		
		
		
	}

}
