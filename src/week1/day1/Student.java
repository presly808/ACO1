package week1.day1;

import week1.day2.*;
// class methods(actions) and fields(state)
public class Student {

	String name;
	int age;
	String phone;
	int group;
	
	Address address;

	public Student(){
		System.out.println("deafault constr");
	}
	
	public Student(String n, int a, String p, int g){
		System.out.println("overloaded constructor");
		name = n;
		age = a;
		phone = p;
		group = g;
	}
	
	public void read(){
		System.out.println("Now im reading");
	}
	
	//overloaded method
	public void read(int hour){
		System.out.println("Im reading for " + hour + " hours");
	}
	
	public void hello(){
		System.out.println("Hello, Im student " + name + 
				" age = " + age + 
				" phone " + phone);
		address.showAdd();
	}
	
	public void initStudent(String n, int a, String p, int g){
		name = n;
		age = a;
		phone = p;
		group = g;
	}
	
}
