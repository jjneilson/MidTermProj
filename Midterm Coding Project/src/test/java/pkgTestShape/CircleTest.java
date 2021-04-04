package pkgTestShape;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import pkgShape.Circle;

public class CircleTest {

	
	@Test
	public void construction() {
		try {
			Circle r = new Circle(10);
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void getters() {
		try {
			Circle r = new Circle(10);
			r.getiRadius();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void setters() {
		try {
			Circle r = new Circle(10);
			r.setiRadius(10);
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void perimeter() {
		try{
			Circle r = new Circle(10);
			r.perimeter();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void area() {
		try {
			Circle r = new Circle(10);
			r.area();
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
	
	@Test
	public void DoesItFit() {
		try {
			Circle r = new Circle(10);
			r.DoesItFit(r);
			r.DoesItFit(new Circle(100));
		}
		catch (Exception e) {
			fail("Should not throw an exception.");
		}
	}
}
