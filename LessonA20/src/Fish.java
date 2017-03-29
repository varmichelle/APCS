import java.util.*;

public class Fish extends SeaCreature {

	public Fish(String name) {
		setName(name);
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is swimming");
	}

	@Override
	public void breed() {
		Random rng = new Random();
		System.out.println(getName() + " just laid " + (rng.nextInt(500)+1) + " eggs");
	}

	@Override
	public void die() {
		System.out.println(getName() + " died");
	}

}
