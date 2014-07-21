package week7.day1.decor;

public abstract class AbstractIngredient implements Ingredient {
	
	private double price;
	private int count;
	private String desc;
	private Ingredient ingredient;
	
	public AbstractIngredient(double price, int count, 
								String desc, Ingredient ingredient) {
		super();
		this.price = price;
		this.count = count;
		this.desc = desc;
		this.ingredient = ingredient;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
	public boolean hasIngredient(){
		return ingredient != null;
	}
	
}
