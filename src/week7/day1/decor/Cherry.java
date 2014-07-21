package week7.day1.decor;

public class Cherry extends AbstractIngredient {

	
	public Cherry(double price, int count, String desc, Ingredient ingredient) {
		super(price, count, desc, ingredient);
	}

	@Override
	public double countPrice() {
		return getPrice() * getCount() + 
							(hasIngredient() ? getIngredient().countPrice() : 0);
	}

}
