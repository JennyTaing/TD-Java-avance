package fr.dauphine.javaavance.td1;

public class Circle {
	
	private Point c;
	private int r;
	
	public Circle() {
		
	}
	
	public Circle(Point c, int r) {
		
	}

	public Circle translate(int i, int j) {
		return new Circle(c.translate(i, j),r);	
	}
	
	public Point getCenter() {
		return c;
	}
	
	public void area() {
		
	}
	
	public String toString() {
		return this.c + "  " + this.r;
	}
	
	public boolean contains(Point p) {		
		If(p<=r){
			return true;
		}return false;
	}
	
	public int getR() {
		return r;
	}
}
