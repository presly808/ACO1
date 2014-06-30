package week4.day2;

import java.util.Arrays;

public class TestSorting {

	public static void main(String[] args) {
		Integer[] mas = {66,112,3,87,-11,23};
		
		SelectionSorter sorter = new SelectionSorter();
		
		sorter.sort(mas);
		
		System.out.println(Arrays.toString(mas));
	}
}
