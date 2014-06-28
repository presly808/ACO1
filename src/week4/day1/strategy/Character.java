package week4.day1.strategy;

public class Character {
	
	private int healt;
	private String name;
	private IWeapon weapon;
	
	public Character(int healt, String name) {
		super();
		this.healt = healt;
		this.name = name;
	}

	public int getHealt() {
		return healt;
	}

	public void setHealt(int healt) {
		this.healt = healt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(IWeapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack(Character enemy){
		enemy.healt -= weapon.use();
	}

	@Override
	public String toString() {
		return "Character [healt=" + healt + ", name=" + name + "]";
	}
	
}
