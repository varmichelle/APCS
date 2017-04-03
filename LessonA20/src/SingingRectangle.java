/**
 * 
 * Class SingingRectangle - Rectangle that sings
 * @author Michelle Li
 * Period 1
 *
 */

public class SingingRectangle extends Rectangle {

	public SingingRectangle(double l, double w) {
		super(l, w);
	}

	@Override
	public String toString() {
		String song = "Rectangle song:\n";
		song += "I'm a rectangle\n";
		song += "You can see.\n";
		song += "I have four sides.\n";
		song += "Count with me.\n";
		song += "2 are short and 2 are long.\n";
		song += "Come along and sing my song.";
		return super.toString() + song;
	}
	
}
