package week6.day1.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//java.io
public class TestInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("e:/dev/test.txt"); 
		int data = -1;
		String input = "";
		
		while((data = fis.read()) != -1){
			input += (char)data;
		}
		
		System.out.println(input);
		
	}

}
