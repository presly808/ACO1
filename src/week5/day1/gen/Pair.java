package week5.day1.gen;

public class Pair <T, E> {
	
	private T first;
	private E second;
	
	private T[] mas;
	
	
	public Pair(T first, E second) {
		super();
		this.first = first;
		this.second = second;
	}


	public T getFirst() {
		return first;
	}


	public void setFirst(T first) {
		this.first = first;
	}


	public E getSecond() {
		return second;
	}


	public void setSecond(E second) {
		this.second = second;
	}

	public void action(){
		
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	
	

}
