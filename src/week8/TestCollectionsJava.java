package week8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestCollectionsJava {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		
		// List - indexes, order
		// ArrayLIst, Vector, LinkedList
		
		// Queue - 
		
		// Set
		// HasSet, TreeSet
		Set<String> set = new HashSet<>(16);
		
		for(int i = 0; i < 6; i++){
			String num = new String((int)(Math.random() * 100) + " ");
			int hash = num.hashCode();
			System.out.println(num + " hash = " + hash + " pos = " + (hash % 16));
			set.add(num);
		}
		System.out.println("**********************");
		
		for(String i : set){
			System.out.print(i + " ");
		}
		
		
	}

}
