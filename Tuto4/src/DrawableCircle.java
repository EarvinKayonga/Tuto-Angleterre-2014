import java.awt.Graphics;


public class DrawableCircle extends Circle implements Drawable {

	private Color color;
	private double posx, posy;
	
	public DrawableCircle(double r, Color c, double x, double y) {
		super(r);
		color=c;
		posx=x;
		posy=y;
	}

	@Override
	public void setColor(Color c) {
		color=c;

	}

	@Override
	public void setPosition(double x, double y) {
		posx=x;
		posy=y;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval((int)posx, (int)posy, (int)this.radius, (int)this.radius);

	}

}
