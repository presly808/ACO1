package week5.day1.gen;

import java.util.ArrayList;

public class TestJavaEx {

	public static void main(String[] args) {
		
		// Runtime Exception
		ArrayList arrayList = new ArrayList();
		arrayList.add("String");
		String s = (String) arrayList.get(0);
		
		
		//
		ArrayList<String> genericArrayList = new ArrayList<String>();
		genericArrayList.add("sss"); // Compilation error
		String s1 = genericArrayList.get(0);
		
	}

}
