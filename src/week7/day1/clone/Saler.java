package week7.day1.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Saler implements Cloneable, Serializable {

	private String name;
	private int age;
	private int experiance;
	private String address;
	private Date start = new Date();
	
	
	public Saler(String name, int age, int experiance, String address) {
		super();
		this.name = name;
		this.age = age;
		this.experiance = experiance;
		this.address = address;
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

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Saler [name=" + name + ", age=" + age + ", experiance="
				+ experiance + ", address=" + address + ", start=" + start
				+ "]";
	}
	
	public Object serialClone(){
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object cloned = null;
		try {
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			ois = new ObjectInputStream(
					new ByteArrayInputStream(baos.toByteArray()));
			cloned = ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(oos != null){
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			if(ois != null){
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return cloned;
		
	}

	@Override
	public Object clone() {		
		Saler s = null;
		try {
			s =  (Saler) super.clone();
			s.address = new String(address);
			s.name = new String(name); // name + "";
			s.start = (Date) start.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}

}
