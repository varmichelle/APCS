/** This program provides a method to draw a benzene compound (circle within a hexagon)
 * @author Michelle Li
 */

import gpdraw.*;

public class Benzene { 
	
	// declaring a private object myPencil as an instance of the DrawingTool class
	private static DrawingTool myPencil;
	// declaring a private object myPaper as an instance of the SketchPad class
	private static SketchPad myPaper;
	
	// constructor (has same name as the class Benzene) to initialize myPaper and myPencil
	public Benzene() { 
		// initializes myPaper, sets dimensions to 500 by 500
		myPaper = new SketchPad(500, 500);
		// initializes myPencil, sets the drawing tool myPencil to draw on myPaper
		myPencil = new DrawingTool(myPaper);
	}
	
	// the draw method draws a Benzene compound
	public void draw() {
		// draw circle
		myPencil.drawCircle(40); 
		// draw hexagon
		myPencil.up();
		myPencil.forward(75);
		myPencil.down();
		myPencil.setDirection(330);
		myPencil.forward(75);
		myPencil.turnRight(60);
		myPencil.forward(75);
		myPencil.turnRight(60);
		myPencil.forward(75);
		myPencil.turnRight(60);
		myPencil.forward(75);
		myPencil.turnRight(60);
		myPencil.forward(75);
		myPencil.turnRight(60);
		myPencil.forward(75);	
	}

}
