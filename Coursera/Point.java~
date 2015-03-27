 /*************************************************************************
 * Name:
 * Email:
 *
 * Compilation:  javac Point.java
 * Execution:
 * Dependencies: StdDraw.java
 *
 * Description: An immutable data type for points in the plane.
 *
 *************************************************************************/
/*
* The below class is taken from the Coursera Algorithms course 1 site. 
* This is not my compelete work
*/
import java.util.Comparator;
import java.lang.*;
import java.io.*;

public class Point implements Comparable<Point> {

    // compare points by slope
//    public final Comparator<Point> SLOPE_ORDER;       // YOUR DEFINITION HERE

    private final int x;                              // x coordinate
    private final int y;                              // y coordinate

    // create the point (x, y)
    public Point(int x, int y) {
        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
    }

    // plot this point to standard drawing
    public void draw() {
        /* DO NOT MODIFY */
//        StdDraw.point(x, y);
    }

    // draw line between this point and that point to standard drawing
    public void drawTo(Point that) {
        /* DO NOT MODIFY */
  //      StdDraw.line(this.x, this.y, that.x, that.y);
    }

    public double slopeTo(Point that) {
        /* YOUR CODE HERE */
        double slope = 0.0;
        if ( ( this.x == that.x ) && ( this.y != that.y) ) { // Check for Horizontal
    	  slope = 0.0;
    	}
    	else if( (this. y == that.y) && (this.x != that.x ) ) {
    	  slope =  Double.POSITIVE_INFINITY;
    	}
    	else if ( this.compareTo(that) == 0 ) {
    	  slope = Double.NEGATIVE_INFINITY;
    	}
    	else{
	  slope = (that.y - this.y)/(that.x - this.x);
    	}    	
    	return slope;
    }

    // is this point lexicographically smaller than that one?
    // comparing y-coordinates and breaking ties by x-coordinates
    public int compareTo(Point that) {
 	if (this.y < that.y) { // 
 	   return -1;
 	}
 	else if (this.y == that.y) { 
 		if (this.x < that.x) { // 
 		   return -1;
 		}
 		else if (this.x == that.x) { // 
 		   return 0;
 		}
 		else {
 			return 1;
 		}
 	}
 	else{
 		return 1;
 	}
    }

    // return string representation of this point
    public String toString() {
        /* DO NOT MODIFY */
        return "(" + x + ", " + y + ")";
    }

    // unit test
    public static void main(String[] args) {
 	
 	Point point = new Point(7,9);
 	Point point2 = new Point(7,9); 	
 	/*
 	*	Test for CompareTo Method
 	*	
 	*/
 	System.out.println(" --------------  Compare To Method Test Output----------------------");
 	
 	
 	System.out.println("Point Comparision Value:"+ point.compareTo(point2));  // Should be 0 - Equal
 	
 	point2 = new Point(7,4);
 	System.out.println("Point Comparision Value:"+ point.compareTo(point2));  // Should be  1 - Greater
 	
 	point2 = new Point(7,11);
 	System.out.println("Point Comparision Value:"+ point.compareTo(point2));  // Should be  	-1 - Smaller
 	
 	System.out.println("-----------------------End ------------------------------------------");
 	
 	System.out.println("---------------------- Slope Method Test Output-------------------------");
 	
 	//  Same point
 	point2 = new Point(7,9);
 	System.out.println("Expected : Negative Infinity :: Actual : "+ point.slopeTo(point2));

	// X Axis same
	point2 = new Point(7,11);
 	System.out.println("Expected : 0.0 :: Actual : "+ point.slopeTo(point2));
 	
 	// Y Axis same
	point2 = new Point(6,9);
 	System.out.println("Expected : Positive Infinity :: Actual : "+ point.slopeTo(point2));
 	
 	// Completely Different points
	point2 = new Point(8,5);
 	System.out.println("Expected : -4 :: Actual : "+ point.slopeTo(point2));
 	
 	System.out.println("-----------------------------End ---------------------------------------");
 	
 	
 	
 	
 		
 	
    }
}
