import java.awt.Graphics;


public interface Drawable {
	
	public void setColor(Color c);
	public void setPosition(double x, double y);
	public void draw(Graphics g);
	
}
