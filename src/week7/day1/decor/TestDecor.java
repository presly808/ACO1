package week7.day1.decor;

public class TestDecor {

	public static void main(String[] args) {
		Ingredient ingredient = new Cherry(3, 2, "", null);
		ingredient = new Coconut(3, 5, "", ingredient);
		
		IceCream iceCream = new IceCream(10, ingredient);
		System.out.println(iceCream.countFullPrice());
	}

}
