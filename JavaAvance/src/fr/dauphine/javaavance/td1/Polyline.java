package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Polyline {
	
	ArrayList<Point> point = new ArrayList<>();
	
	public Polyline() {
		
	}

	public void add(Point pt) {
		point.add(pt);
	}
	
	public int pointCapacity(){
		return point.size();
	}
	
	public int nbPoints(){
		int nbPoints = 0;
		for(int i = 0 ; i<point.size() ; i++) {
			if(point.get(i)!=null) {
				nbPoints = nbPoints + 1;
			}
		}
		return nbPoints;
	}
	
	public boolean contains(Point p) {
		for(Point point : point) {
			if(point==p) {
				return true;
			}
		}
		return false;
	}
	
}
