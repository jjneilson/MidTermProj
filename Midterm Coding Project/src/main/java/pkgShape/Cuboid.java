package pkgShape;

public class Cuboid extends Rectangle {

	private int iDepth;
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public Cuboid(int width, int length,int depth) {
		super(width, length);
		if (this.iDepth<=0) throw new IllegalArgumentException();
		this.iDepth=depth;
	}
	
	public double area() {
		return this.getiWidth()*this.getiLength()*2+this.getiWidth()*this.getiDepth()*2+this.getiDepth()*this.getiLength()*2;
	}
	
	public double volume() {
		return this.getiDepth()*this.getiLength()*this.getiWidth();
	}

}
