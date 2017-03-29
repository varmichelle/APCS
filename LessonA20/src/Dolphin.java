import java.util.Random;

public class Dolphin extends SeaCreature {

	public Dolphin(String name) {
		setName(name);
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is swimming");
	}

	@Override
	public void breed() {
		Random rng = new Random();
		System.out.println(getName() + " just laid " + (rng.nextInt(2)+1) + " calf(ves)");
	}

	@Override
	public void die() {
		System.out.println(getName() + " died");
	}

}
