package week8;

import java.util.HashSet;

public class TestHash {

	public static void main(String[] args) {
		HashSet<CatForHash> hashSet = new HashSet<>();
		
		CatForHash catForHash1 = new CatForHash("Murchik", 2, 4, true);
		CatForHash catForHash2 = new CatForHash("Adolf", 1, 2, false);
		CatForHash catForHash3 = new CatForHash("Elvis", 4, 8, true);
		
		hashSet.add(catForHash1);
		hashSet.add(catForHash2);
		hashSet.add(catForHash3);
		
		CatForHash catForHash4 = new CatForHash("Elvis", 4, 8, true);
		
		System.out.println(catForHash3.equals(catForHash4));
		System.out.println(catForHash3.hashCode() + " " + catForHash4.hashCode());
		
		System.out.println(hashSet.contains(catForHash4));
		
		
		
	}

}
