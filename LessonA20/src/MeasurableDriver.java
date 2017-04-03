/**
 * 
 * Class MeasurableDriver - test the Measurable interface and the Circle, Rectangle, and Triangle classes
 * @author Michelle Li
 * Period 1
 *
 */


import java.util.*;

public class MeasurableDriver {

	public static void main(String[] args) {
		
		ArrayList<Measurable> list = new ArrayList<Measurable>();
		list.add(new Circle(1));
		list.add(new Rectangle(1,1));
		list.add(new Triangle(3,4,5));
		list.add(new SingingRectangle(2,2));
		list.add(new Circle(1.5));
		list.add(new Rectangle(1,1.5));
		list.add(new Triangle(7,24,25));
		list.add(new Circle(2));
		list.add(new Rectangle(2,3));
		list.add(new Triangle(11,60,61));
		
		for (Measurable figure : list) {
			System.out.println(figure);
		}
		
	}
	
}
