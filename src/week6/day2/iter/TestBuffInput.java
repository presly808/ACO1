package week6.day2.iter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TestBuffInput {

	public static void main(String[] args) throws IOException {
		// File 
		File file = new File("my.txt");
		
		if(!file.exists()){
			file.createNewFile();
		}
	
		char[] buff = new char[1000];
		FileReader fr = new FileReader(file);
		int sizeOfRead = fr.read(buff);
		
		String s = new String(buff, 0 , sizeOfRead);
		System.out.println(s);
		
		PrintWriter pw = new PrintWriter("created.txt");
		for(int i = 0; i < 10; i++){
			pw.println("new");
		}
		
		pw.close();
		
	}

}
