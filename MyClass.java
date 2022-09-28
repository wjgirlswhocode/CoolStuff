import gpdraw.*;

public class MyClass {
	public static void main(String[] args) {
		int width = 500;
		int height = 500;
		DrawingTool pen = new DrawingTool(new SketchPad(width, height));

		for (int i = 0; i < 4; i++) {
			pen.forward(100);
			pen.turnRight(180 - 30);
			pen.forward(100);
			pen.turnLeft(90 - 30);
		}
		
		pen.up();
		pen.move(-82, -18);
		pen.down();
		pen.setDirection(90);
		
		for (int i = 0; i < 360; i++) {
			pen.forward(2);
			pen.turnRight(1);
		}
	}
}
