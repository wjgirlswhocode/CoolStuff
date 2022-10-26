import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gpdraw.*;

public class MyDrawing {
	
	private int windowWidth = 500;
	private int windowHeight = 500;
	private SketchPad sketchPad = new SketchPad(windowWidth, windowHeight);
	private DrawingTool pen = new DrawingTool(sketchPad);
	
	private void drawStuff() {
		for (int i = 0; i < 4; i++) {
			pen.forward(100);
			pen.turnRight(90);
		}
	}
	
	public static void main(String[] args) {
		MyDrawing drawing = new MyDrawing();
		drawing.sketchPad.addKeyListener(drawing.new Listener());
		drawing.drawStuff();
	}
	
	private class Listener implements KeyListener {
		private double speed = 5;
						
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
		    if (keyCode == KeyEvent.VK_SPACE) {
		    	if (pen.isDown()) {
		    		pen.up();
		    	} else {
		    		pen.down();
		    	}
		    } else if (keyCode == KeyEvent.VK_W) {
		    	pen.setDirection(90);
		    	pen.forward(speed);
		    } else if (keyCode == KeyEvent.VK_A) {
		    	pen.setDirection(180);
		    	pen.forward(speed);
		    } else if (keyCode == KeyEvent.VK_S) {
		    	pen.setDirection(270);
		    	pen.forward(speed);
		    } else if (keyCode == KeyEvent.VK_D) {
		    	pen.setDirection(0);
		    	pen.forward(speed);
		    }
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	}
}
