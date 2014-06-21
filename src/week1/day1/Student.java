package week1.day1;

import week1.day2.*;
// class methods(actions) and fields(state)
public class Student {

	String name;
	int age;
	String phone;
	int group;
	
	private Subject subject;
	
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
	
	public void passHours(int hours){
		subject.setHours(hours);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", phone=" + phone
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Student)){
			return false;
		}
		
		Student other = (Student) obj;
		
		return this.name != null  ? 
				(this.name.equals(other.getName()) && 
						this.age == other.getAge()) : false ;
	}
	
	
	
	
	
}
