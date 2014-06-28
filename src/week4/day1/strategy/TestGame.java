package week4.day1.strategy;

public class TestGame {

	public static void main(String[] args) {
		Character troll = new Character(250, "Andrey");
		Character hobbit = new Character(1000, "Frodo");
		
		Knife knife = new Knife();
		Sword sword = new Sword();
		
		troll.setWeapon(sword);
		hobbit.setWeapon(knife);
		
		troll.attack(hobbit);
		
		System.out.println(troll);
		System.out.println(hobbit);
		
		hobbit.attack(troll);
		System.out.println(troll);
		System.out.println(hobbit);
		
	}

}
