package week3.day1;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] mas) {
		for (int j = 0; j < mas.length; j++) {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					int temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
				}
			}
		}
	}
	
	public static void sort(Comparable[] mas) {
		for (int j = 0; j < mas.length; j++) {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i].compareTo(mas[i + 1]) > 0) {
					Comparable temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] mas = { 3, 1, 9, -56, 101, 22 };
		
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(mas));
		
		sort(mas);
		
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(mas));
	}

}
