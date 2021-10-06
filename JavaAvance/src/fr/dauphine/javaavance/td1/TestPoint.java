package fr.dauphine.javaavance.td1;

import java.util.ArrayList;
import java.util.List;

public class TestPoint {
	private int x;
	private int y;	
	
	public static void main(String[] args) {		
		Point point = new Point(1,0);
		System.out.println(point); 
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		System.out.println(p1.isSameAs(p2));
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		Point p=new Point(1,2);
		//Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		//System.out.println(c+" "+c2);
		
		Circle c=new Circle(new Point(1,2), 1);
		c.getCenter().translate(1,1);
		System.out.println(c);
		
		System.out.println(ring);

	}
	
}

