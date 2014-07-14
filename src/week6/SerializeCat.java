package week6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeCat {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.setAge(5);
		cat.setFl(new Flavor("house-cat"));
		
		
		try{
			FileOutputStream fs = new FileOutputStream("cat.out");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(cat);
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream fis = new FileInputStream("cat.out");
			ObjectInputStream is = new ObjectInputStream(fis);
			Cat cat2 = (Cat) is.readObject();
			is.close();
			System.out.println(cat2);
		}catch(Exception e){
			e.printStackTrace();
		}
		}

	}


