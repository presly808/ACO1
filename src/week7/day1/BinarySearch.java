package week7.day1;

// 5 / 2 = 2;
public class BinarySearch {
	
	// 0,1,2,3,4,5,6,7,8,9
	public static int binarySearch(int[] mas, int key){
		int start = 0;
		int end = mas.length - 1;
		
		while(start <= end){
			int mid = start + (end - start) / 2;
			if(key < mas[mid]) {
				end = mid - 1;
			} else if(key > mas[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
		
	}
	
	public static int binarySearch(int[] mas, int start, int end, int key){
		
		if(start > end) {
			return -1;
		} else {
		
			int mid = start + (end - start) / 2;
			if(key < mas[mid]) {
				end = mid - 1;
			} else if(key > mas[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
			return binarySearch(mas, start, end, key);
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] mas = {1,2,3,4,5,6,7,8,9,10, 11};
		int pos = binarySearch(mas,0,mas.length-1,10);
		System.out.println(pos);
	}
	
}
