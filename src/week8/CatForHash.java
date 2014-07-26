package week8;

public class CatForHash {
	
	private String name;
	private int age;
	private double weight;
	private boolean home;
	
	public CatForHash(String name, int age, double weight, boolean home) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.home = home;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatForHash other = (CatForHash) obj;
		if (age != other.age)
			return false;
		if (home != other.home)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double
				.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * hash + age; // hash consider age field
		hash = 31 * hash + (name != null ? name.hashCode() : 0);// consider name
		long val = Double.doubleToLongBits(weight);
		hash = 31 * hash + (int)(val ^ (val >>> 32));
		hash = 31 * hash + (home ? 1 : 0);
		return hash;
	}

	
	
	
	
	
}
