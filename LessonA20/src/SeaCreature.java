
public abstract class SeaCreature {

	private String myName;
	public abstract void swim();
	public abstract void breed();
	public abstract void die();
	public String getName() {
		return myName;
	}
	public void setName(String s) {
		myName = s;
	}
	
}
