package fr.dauphine.javaavance.td1;

public class Ring extends Circle {
	private int r2;
	
	public Ring() {
		super();
	}
	
	public void equals() {
		
	}

	public boolean contains(Point p) {		
		If(p>=r && p<=r2){
			return true;
		}return false;
	}
	
	public String toString() {
		return ""+this.r2;
	}
	
}
