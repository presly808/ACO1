package week7.day1.decor;

public class Coconut extends AbstractIngredient {

	public Coconut(double price, int count, String desc, Ingredient ingredient) {
		super(price, count, desc, ingredient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double countPrice() {
		return getPrice() * getCount() + 
							(hasIngredient() ? getIngredient().countPrice() : 0);
	}

	
	
}
