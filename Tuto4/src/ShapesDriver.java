import java.awt.Frame;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;


public class ShapesDriver extends JFrame {

	private ArrayList<Drawable> shapes;
	
	public void paint(Graphics g) {
		for (Drawable d : shapes) 
			d.draw(g);
	}
	
	public ShapesDriver() {
		shapes = new ArrayList<Drawable>();
		shapes.add(new DrawableRectangle(30, 50, Color.BLUE, 40, 100));
		shapes.add(new DrawableCircle(100, Color.RED, 100, 20));
		
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		ShapesDriver doz = new ShapesDriver();
		
	}

}
