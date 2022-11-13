//import required packages
import java.awt.Color;
import gpdraw.*;

public class MyDrawing {
	public static void main(String[] args) {
		int windowWidth = 500;
		int windowHeight = 500;
		DrawingTool pen = new DrawingTool(new SketchPad(windowWidth, windowHeight));
		
		//Square
		int length = 80; //side length of the square
		pen.setColor(Color.green); //Color of the square
		pen.setDirection(90); //point the pen up
		pen.forward(length);
		pen.setDirection(0); //point the pen right
		pen.forward(length);
		pen.setDirection(-90); //point the pen down
		pen.forward(length);
		pen.setDirection(-180); //point the pen left
		pen.forward(length);
		
		//Circle
		pen.setDirection(180); //point the pen left
		pen.up(); //lift the pen tip up
		pen.forward(100);
		pen.down(); //put the pen tip down
		pen.setColor(Color.red); //Color of the circle
		pen.fillCircle(30); //draws a circle of radius 30
		
		//Triangle
		pen.setDirection(-60); //point the pen right-down
		pen.up(); //lift the pen tip up
		pen.forward(110);
		pen.setDirection(90); //point the pen up
		pen.down(); //put the pen tip down
		pen.setColor(Color.blue);
		for (int i = 0; i < 3; i++) { //draw the 3 sides of the triangle
			pen.forward(80);
			pen.turnRight(120); //turn the pen 120 degrees to the right
		}
	}
}
