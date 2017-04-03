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
		song += "\tI'm a rectangle.\n";
		song += "\tYou can see.\n";
		song += "\tI have four sides.\n";
		song += "\tCount with me\n";
		song += "\t2 are short and 2 are long.\n";
		song += "\tCome along and sing my song.\n";
		return super.toString() + song;
	}
	
}
