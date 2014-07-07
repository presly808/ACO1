package week5.day1.gen.task_1;

/*
 * TODO: implement Comparable, override equals, toString, 
 * sort using InsertionAlgorithm see <T extends Comparable<T>>
 */

public class MyArray<T> implements IArray<T> {

	private T[] mas; 
	private int index;
	
	public MyArray(int size){
		mas = (T[]) new Object[size]; // new Object[] != new Object()
	}
	
	@Override
	public void add(T value) {
		mas[index++] = value;
	}

	@Override
	public void deleteLast() {
		mas[--index] = null;
	}
	
	public void sort(){
		if(!(mas[0] instanceof Comparable)){
			System.out.println("Can not sort");
			return;
		}
		
		// Comparable[] com = this.mas;
		for(int i = 1; i < index; i++){
			int j = i;
				while(j > 0  && ((Comparable)mas[j-1]).compareTo(mas[j]) > 0){
					T temp = mas[j-1];
					mas[j-1] = mas[j];
					mas[j] = temp;
					j--;
			}
			
		}
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public T[] getMas() {
		return mas;
	}

	public void setMas(T[] mas) {
		this.mas = mas;
	}
	
	
	public void showAll(){
		for(int i = 0; i < index; i++){
			System.out.print(mas[i] + " ");
		}
	}
	
	//
	
}
