package week3.day2.java_sort;

import java.util.Arrays;

import week3.day1.BubbleSort;

public class TestSorting {

	public static void main(String[] args) {
		Coffee[] mas = prepareCoffees(10);
		
		System.out.println(Arrays.toString(mas));
		BubbleSort.sort(mas);
		//Arrays.sort(mas);
		
		System.out.println(Arrays.toString(mas));
		
	}
	
	public static Coffee[] prepareCoffees(int size){
		Coffee[] mas = new Coffee[size];
		for(int i = 0; i < mas.length; i++){
			Coffee c = new Coffee(5 + Math.random() * 5, 
									(int)(Math.random() * 5), 
									(int)(Math.random() * 5));
			mas[i] = c;
		}
		return mas;
	}
}
