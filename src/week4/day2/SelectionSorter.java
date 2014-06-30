package week4.day2;

import java.util.Comparator;

public class SelectionSorter {
	
	public void sort(Integer[] mas){
		
		for(int i = 0; i < mas.length; i++){
			int minI = i;
			//finding min index
			for(int j = i + 1; j < mas.length; j++){
				if(mas[minI] > mas[j]) {
					minI = j;	
				}
			}
			
			swap(mas, minI, i);
			
		}
	}
	
	public void sort(Object[] mas, Comparator comparator){
		for(int i = 0; i < mas.length; i++){
			int minI = i;
			//finding min index
			for(int j = i + 1; j < mas.length; j++){
				if(comparator.compare(mas[minI], mas[j]) > 0) {
					minI = j;	
				}
			}
			
			swap(mas, minI, i);
			
		}
	}
	
	public void swap(Object[] mas, int a, int b){
		Object temp = mas[a];
		mas[a] = mas[b];
		mas[b] = temp;
	}
	
}
