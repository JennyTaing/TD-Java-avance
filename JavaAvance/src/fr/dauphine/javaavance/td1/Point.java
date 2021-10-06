package fr.dauphine.javaavance.td1;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		Point p=new Point();	
		System.out.println(p.getX()+" "+p.getY());		
	}
	
	public Point(int px,int py) {
		x = px;
		y = py;
	}
	
	public Point(Point p2) {
		x = p2.x;
		y = p2.y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public String toString() {
		return "( "+ this.x + " , " + this.y + " ) ";
	}
	
	public boolean isSameAs(Point point) {
		return (x==point.x) && (y==point.y);		
	}
	
	public Point translate(int dx, int dy) {
		return new Point(x+dx,y+dy);
	}
	
}
