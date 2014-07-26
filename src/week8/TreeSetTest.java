package week8;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Victor");
		treeSet.add("Oleg");
		treeSet.add("Bogdan");
		treeSet.add("Ivan");
		treeSet.add("Sasha");
		treeSet.add("Nikita");
		
		for(String name : treeSet){
			System.out.println(name);
		}
		
	}

}
