package week6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestIO {

	public static void main(String[] args) throws IOException {
		String client = "Andrey/25/12900/M";
		writeClient(client);
		
		String readClient = readClient();
		System.out.println(readClient);
		
		String[] words = readClient.split("/");
		String name = words[0];
		int age = Integer.parseInt(words[1]);
		double amount = Double.parseDouble(words[2]);
		char sex = Character.valueOf(words[3].charAt(0));

	}
	
	public static void writeClient(String client) throws IOException{
		PrintWriter pw = new PrintWriter("client.txt");
		pw.println(client);
		pw.close();
	}
	
	public static String readClient() throws IOException{
		Scanner sc = new Scanner(new File("client.txt"));
		return sc.nextLine();
	}

}
