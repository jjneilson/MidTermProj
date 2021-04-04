package pkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	public int getiWidth() {
		
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		if(iWidth<=0) throw new IllegalArgumentException();
		this.iWidth = iWidth;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		if(iLength<=0) throw new IllegalArgumentException();
		this.iLength = iLength;
	}
	
	public Rectangle(int width,int length) {
		if(width<=0 ||length<=0) throw new IllegalArgumentException();
		this.iWidth=width;
		this.iLength=length;
	}
	@Override
	public double area() {
		return this.iLength*this.iWidth;
	}

	@Override
	public double perimeter() {
		return this.iLength*2+this.iWidth*2;
	}

	public double closeSide() {
		double close=0;
		if (this.iLength/2>=this.iWidth/2) close=this.iWidth/2;
		else close=this.iLength/2;
		return close;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean equal=false;
		if (this==o) {
			if (this.getiWidth()==((Rectangle)o).getiWidth() &&this.getiLength()==((Rectangle)o).getiLength()) {
				equal=true;
			}
		}
		return equal;
	}
	
	public boolean DoesItFit(Object o) {
		boolean fit=false;
		if (o instanceof Circle) {
			if (((Circle) o).getiRadius() >=this.closeSide()) fit=true;
		}
		else {
			if (((Rectangle) o).closeSide()>=this.closeSide()) fit=true;
		}

		return fit;
	}
}
