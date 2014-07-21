package week7.day1.decor;

public class IceCream {
	
	private double price;
	private Ingredient ingredient;
	
	public IceCream(double price, Ingredient ingredient) {
		super();
		this.price = price;
		this.ingredient = ingredient;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
	public double countFullPrice(){
		return price + (ingredient != null ? ingredient.countPrice() : 0);
	}
	
}
