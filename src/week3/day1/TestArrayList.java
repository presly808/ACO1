package week3.day1;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(5);
		al.add("line1");
		al.add(0, "line2");
		System.out.println(al.get(0));
		System.out.println("Contains lin3 " + al.contains("line3"));
		int line2Index = al.indexOf("line2");
		
		al.set(0, "line3");
		al.clear();
		
		al.remove(0);
		
		al.remove("line1");
		String[] mas = (String[])al.toArray();
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i = 0 ; i < 10; i++){
			al2.add(i);
		}
		
		
		
		
	}

}
