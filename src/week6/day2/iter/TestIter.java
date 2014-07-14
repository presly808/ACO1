package week6.day2.iter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import week5.day1.gen.task_1.MyArray;
import week5.day2.struct.LinkedStack;

public class TestIter {

	public static void main(String[] args) {
		List<String> mas = Arrays.asList("my", "new", "some","task");
		Iterator<String> iter = mas.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		LinkedStack ls = new LinkedStack();
		ls.push(1);
		ls.push(22);
		ls.push(45);
		ls.push(123);
		ls.push(56);
		ls.push(987);
		
		System.out.println("*********************************");
		for(Object o : ls){
			System.out.print(o + " ");
		}
		
		
		MyArray<String> myArray = new MyArray<String>(20);
		myArray.add("good");
		myArray.add("Morning");
		myArray.add("Nikita");
		System.out.println("\n*****************************");
		
		for(String s : myArray){
			System.out.println(s);
		}
		
		System.out.println("*******************************");
		Iterator<String> arrayIter = myArray.iterator();
		while (arrayIter.hasNext()) {
			System.out.println(arrayIter.next());
			
		}
		
	}

}
