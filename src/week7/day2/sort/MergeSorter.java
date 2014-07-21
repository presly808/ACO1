package week7.day2.sort;

public class MergeSorter {

	private Comparable[] aux;
	
	
	private void merge(Comparable[] mas, int low, int hight, int mid){
		
		int i = low;
		int j = mid + 1;
		
		for(int k = low; k<=hight; k++){
			aux[k] = mas[k];
		}
		
		for(int k = low; k <= hight; k++){
			if(i > mid){
				mas[k] = aux[j++];
			} else if(j > hight){
				mas[k] = aux[i++];
			} else if(less(aux[i], aux[j])){
				mas[k] = aux[i++];
			} else {
				mas[k] = aux[j++];
			}
		}
	}
	
	private boolean less(Comparable one, Comparable another){
		return one.compareTo(another) < 0;
	}
	
	public Comparable[] sort(Comparable[] mas){
		aux = new Comparable[mas.length];
		sort(mas, 0, mas.length - 1); // recursive method
		return mas;
	}
	
	private void sort(Comparable[] mas, int low, int hight){
		if(low >= hight){
			return;
		}
		int mid = low + ((hight - low) / 2);
		
		sort(mas, low, mid);
		sort(mas, mid + 1, hight);
		
		merge(mas, low, hight, mid);
	}
	
	
	public static void main(String[] args) {
		MergeSorter mergeSorter = 
				new MergeSorter();
		mergeSorter.sort(new Integer[]{55,23,17,44,1,10, 56, 10});
	}
	
}
