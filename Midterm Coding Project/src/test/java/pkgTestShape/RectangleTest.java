package pkgTestShape;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	
	@Test
	public void construction() {
		try {
			Rectangle r = new Rectangle(10,8);
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void getters() {
		try {
			Rectangle r = new Rectangle(10,8);
			r.getiLength();
			r.getiWidth();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void setters() {
		try {
			Rectangle r = new Rectangle(10,8);
			r.setiLength(10);
			r.setiWidth(10);
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void perimeter() {
		try{
			Rectangle r = new Rectangle(8,10);
			r.perimeter();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void area() {
		try {
			Rectangle r = new Rectangle(10,8);
			r.area();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void DoesItFit() {
		try {
			Rectangle r = new Rectangle(10,8);
			r.DoesItFit(r);
			r.DoesItFit(new Rectangle(100,100));
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
}
