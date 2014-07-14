package week6;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cat implements Serializable {
	
	private int age;
	transient private Flavor fl;
	static int count;
	
	public Cat(){
		age = 10;
		count ++;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public Flavor getFl() {
		return fl;
	}

	public void setFl(Flavor fl) {
		this.fl = fl;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", fl=" + fl + "]";
	}
	
	private void writeObject(ObjectOutputStream os){
		try{		
		os.writeObject(fl.getName());
		os.defaultWriteObject();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	private void readObject(ObjectInputStream is){
		try{
			fl = new Flavor((String)is.readObject());
		is.defaultReadObject(); 
	
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

	
	
	
	
	

}
