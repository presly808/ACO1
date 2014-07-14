package week6.day1.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("e:/dev/test.txt");
		
		String word = "test 67asdasd0 for writer";
		byte[] bytes = word.getBytes();
		
		
		fos.write(bytes);
		fos.close();
	}

}
