package week3.day2.java_sort;

public class Coffee implements Comparable {

	private double price;
	private int sugar;
	private int milk;

	public Coffee(double price, int sugar, int milk) {
		super();
		this.price = price;
		this.sugar = sugar;
		this.milk = milk;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	@Override
	public String toString() {
		return "Coffee [price=" + price + ", sugar=" + sugar + ", milk=" + milk
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		Coffee other = (Coffee) o;
		return this.sugar - other.sugar;
	}

}
