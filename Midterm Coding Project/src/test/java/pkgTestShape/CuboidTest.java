package pkgTestShape;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;

public class CuboidTest {

	
	@Test
	public void construction() {
		try {
			Cuboid r = new Cuboid(10,10,10);
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void getters() {
		try {
			Cuboid r = new Cuboid(10,10,10);
			r.getiLength();
			r.getiDepth();
			r.getiWidth();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void setters() {
		try {
			Cuboid r = new Cuboid(10,10,10);
			r.setiWidth(10);
			r.setiDepth(10);
			r.setiLength(10);
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void perimeter() {
		try{
			Cuboid r = new Cuboid(10,10,10);
			r.perimeter();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void area() {
		try {
			Cuboid r = new Cuboid(10,10,10);
			r.area();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void DoesItFit() {
		try {
			Cuboid r = new Cuboid(10,10,10);
			r.DoesItFit(r);
			r.DoesItFit(new Cuboid(100,100,100));
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
}
