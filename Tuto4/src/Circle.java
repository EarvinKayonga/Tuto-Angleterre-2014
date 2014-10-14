
public class Circle implements Shape {

	public double radius;
	
	public Circle(double r) {
		if (r>0)
			radius=r;
	}

	public double area() {
		return Math.PI*radius*radius;
	}
}
