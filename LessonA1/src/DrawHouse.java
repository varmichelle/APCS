/** This program provides a method to draw a house with 2 windows, a door, and a roof
 * @author Michelle Li
 */

// import gpdraw.jar
import gpdraw.*;

public class DrawHouse {

	// declaring a private object myPencil as an instance of the DrawingTool class
	private static DrawingTool myPencil;
	// declaring a private object myPaper as an instance of the SketchPad class
	private static SketchPad myPaper;
	
	// constructor (has same name as the class DrawHouse) to initialize myPaper and myPencil
	public DrawHouse() {
		// initializes myPaper, sets dimensions to 500 by 500
		myPaper = new SketchPad(500, 500);
		// initializes myPencil, sets the drawing tool myPencil to draw on myPaper
		myPencil = new DrawingTool(myPaper);
	}
	
	// the draw method draws a house 
	public static void draw(){
		// draw the frame of the house
		/*
		myPencil.forward(100);
		myPencil.turnLeft();
		myPencil.forward(100);
		myPencil.turnLeft();
		myPencil.forward(100);
		myPencil.turnLeft();
		myPencil.forward(100);
		myPencil.turnRight();
		// draw the door
		myPencil.turnRight();
		myPencil.forward(60);
		myPencil.turnLeft();
		myPencil.turnRight();
		// draw the roof
		myPencil.turnRight();
		myPencil.forward(50);
		myPencil.turnRight();
		myPencil.forward(20);
		myPencil.turnRight();
		myPencil.forward(50);
		// draw the windows
		myPencil.up();
		myPencil.move(-100,100);
		myPencil.down();
		myPencil.move(-50, 150);
		myPencil.move(0, 100);
		myPencil.up();
		myPencil.move(-90, 60);
		myPencil.down();
		myPencil.setDirection(90);
		myPencil.forward(25);
		myPencil.turnRight();
		myPencil.forward(15);
		myPencil.turnRight();
		myPencil.forward(25);
		myPencil.turnRight();
		myPencil.forward(15);
		myPencil.up();
		myPencil.move(-10, 60);
		myPencil.down();
		myPencil.setDirection(90);
		myPencil.forward(25);
		myPencil.turnLeft();
		myPencil.forward(15);
		myPencil.turnLeft();
		myPencil.forward(25);
		myPencil.turnLeft();
		myPencil.forward(15);
		*/
		myPencil.drawCircle(80);
		myPencil.up();
		myPencil.home();
		myPencil.forward(80);
		myPencil.down();
		myPencil.setDirection(0);
		myPencil.forward(80);
		myPencil.turnRight(90);
		myPencil.forward(160);
		myPencil.turnRight(90);
		myPencil.forward(160);
		myPencil.turnRight(90);
		myPencil.forward(160);
		myPencil.turnRight(90);
		myPencil.forward(80);
		myPencil.up();
		myPencil.move(0, 0);
		myPencil.down();
		myPencil.drawCircle(80 * Math.sqrt(2));
	}

}
