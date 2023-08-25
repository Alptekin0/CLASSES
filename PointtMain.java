package algoritma;

import java.util.HashSet;
import java.util.Set;

public class PointtMain {

	 public static void main(String[] args) {
	  Pointt p1=new Pointt(5, 6);
	  
	  Set<Pointt> points = new HashSet<Pointt>();
	  points.add(p1);
	  points.add(new Pointt(1, 2));
	  points.add(new Pointt(5, 3));
	  
	  System.out.println(points.size());
	  points.add(new Pointt(1, 2));
	  System.out.println(points.size());
	  points.add(p1);
	  System.out.println(points.size()); //Referanslari aynidir
	       


	  for(Pointt point: points) {
	   System.out.println(point.getX() +" , "+ point.getY());
	  }
	  
	  
	  

	 }

	}