import java.util.ArrayList;

public class SeaCreatureDriver {

	public static void main(String[] args) {
		
		ArrayList<SeaCreature> creatures = new ArrayList<SeaCreature>();
		creatures.add(new Fish("Wanda"));
		creatures.add(new Octopus("Squiddly"));
		creatures.add(new Dolphin("Flipper"));
		for (SeaCreature s : creatures) {
			s.swim();
			s.breed();
			s.die();
		}
		
	}

}
