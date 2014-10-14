import java.awt.Graphics;


public class DrawableRectangle extends Rectangle implements Drawable {

	private Color color;
	private double posx, posy;
	
	public DrawableRectangle(double h, double w, Color c, double x, double y) {
		super(h, w);
		color = c;
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
		g.drawRect((int)posx, (int)posy, (int)this.width,(int)this.height);

	}

}
