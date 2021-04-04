package pkgShape;

public class Circle extends Shape {
	
	private double iRadius;

	public double getiRadius() {
		return iRadius;
	}

	public void setiRadius(double iRadius) {
		if (iRadius <= 0) throw new IllegalArgumentException();
		this.iRadius = iRadius;
	}

	public Circle(int radius) {
		if (radius <= 0) throw new IllegalArgumentException();
		this.iRadius=radius;
	}
	
	@Override
	public double area() {
		return this.iRadius*this.iRadius*Math.PI;
	}

	@Override
	public double perimeter() {
		return 2*this.iRadius*Math.PI;
	}
	
	public boolean DoesItFit(Object o) {
		
		boolean fit=false;
		if (o instanceof Circle) {
			if (((Circle) o).iRadius >=this.iRadius) fit=true;
		}
		else {
			if (((Rectangle) o).closeSide()>=this.iRadius) fit=true;
		}
		return fit;
	}
	
}

