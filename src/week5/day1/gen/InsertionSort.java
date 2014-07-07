package week5.day1.gen;

import java.util.Arrays;

import week5.day1.gen.task_1.MyArray;
// todo: make sort generic 
// see ? and <T extends Comparable<T>>
public class InsertionSort {
	// j = 5  i = 7
	// i = 5 + 7 = 12
	// j = 12 - j = 7
	// i = i - j
	public static void sort(int[] mas){
		for(int i = 1; i < mas.length; i++){
			int j = i;
				while(j > 0  && mas[j-1] > mas[j] ){
				mas[j-1] = mas[j-1] + mas[j];
				mas[j] = mas[j-1] - mas[j];
				mas[j-1] = mas[j-1] - mas[j];
				j--;
			}
			
		}
	}
	
	public static void sort(MyArray<? extends Comparable> arr){
		Comparable[] mas = arr.getMas();
		for(int i = 1; i < arr.getIndex(); i++){
			int j = i;
				while(j > 0  && mas[j-1].compareTo(mas[j]) > 0 ){
				Comparable temp = mas[j-1];
				mas[j-1] = mas[j];
				mas[j] = mas[j-1];
				j--;
			}
			
		}
	}
	
	public static <T extends Comparable<T>> void sortGen(MyArray<T> arr){
		Comparable[] mas = arr.getMas();
		for(int i = 1; i < arr.getIndex(); i++){
			int j = i;
				while(j > 0  && mas[j-1].compareTo(mas[j]) > 0 ){
				Comparable temp = mas[j-1];
				mas[j-1] = mas[j];
				mas[j] = mas[j-1];
				j--;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] mas = {45,12,-5,22,11,23};
		sort(mas);
		System.out.println(Arrays.toString(mas));
		MyArray<Integer> arr = new MyArray<>(23);
		InsertionSort.<Integer>sortGen(arr);
	}
	
}
