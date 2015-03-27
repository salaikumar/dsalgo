/*
* Percolation 
* Assignment 1 at coursera.
*/ 

import java.io.*;
import java.lang.*;


public class Percolation{

	// The N X N grid
	private boolean[] grid;
	
	// WeightedQuickUnion Instance.
	private WeightedQuickUnionUF uf;
	
	// Grid Size
	private int gridSize;
	
	/*
	* Constructor.
	* @param - size the size of the grid.				 
	*/
	public Percolation(int n){
		if (n <= 0 ) { // 
		   throw new java.lang.IllegalArgumentException("The Grid size can't be negative or zero");
		}
		grid = new boolean[n*n];
		uf = new WeightedQuickUnionUF(n*n);	
		gridSize = n;
	}

	/*
	* Open - Opens the given Site and connects it with nearby open neighbours
	*/
	public void open(int i, int j){
		if ( ( i < 1 || i > gridSize) || ( j < 1 || j > gridSize) ) { // Corner Case Check 
		   throw new java.lang.IndexOutOfBoundsException("Indexes not within Range" + i + "," + j);
		}
		
		if ( ! isOpen( i,  j) ) {  
		 // Get the One Dimensional Position/
		 int row = i-1;
		 int col = j-1;
		 int arrayPosition = (row * gridSize) + col;
		 
		 grid[arrayPosition] = true;
		 
		 // check for Open Neighbours and connect to them
		 // Top
		 int neighbour;
		 if ( i -1 >= 1) { //   Row within index
		    if ( isOpen ( i-1 ,j ) ) { //  If the Top Neighbour is Open, Union the two neighbours
		       neighbour = ((row-1) * gridSize)+ col;
		       uf.union( arrayPosition, neighbour);
		    }
		 }
		 
		 //Bottom
		 if ( i+1 <= gridSize) { // Row within index 
		    if ( isOpen (i+1, j) ) { // If the bottom Neighbour is Open , Union them
		       neighbour = ((row+1) * gridSize)+ col;
		       uf.union( arrayPosition, neighbour);
		    }
		 }
		    
		 // Right
		 if ( j+1 <= gridSize) { // 
		    if ( isOpen ( i, j+1)) { // 
		       neighbour = ((row* gridSize)+ (col+1) );
		       uf.union( arrayPosition, neighbour);
		    }
		 }
		 
		 // Left
		 if ( j -1 >= 1) { // 
		    if ( isOpen ( i, j-1) ) { // 
		       neighbour = ((row* gridSize)+ (col-1) );
		       uf.union( arrayPosition, neighbour);
		    }
		 }
		}	
	}
	
	/*
	* Checks if a given site is a open site
	*/
	public boolean isOpen(int i, int j){
		if ( ( i < 1 || i > gridSize) || ( j < 1 || j > gridSize) ) { // Corner Case Check 
		   throw new java.lang.IndexOutOfBoundsException("Indexes not within Range" + i + "," + j);
		}
	
		int arrayPosition = ( (i-1) * gridSize ) + (j-1);
		return (grid[arrayPosition] == true ) ;
		
	}
	
	/*
	* Checks if the given site is a Full site
	*/
	public boolean isFull(int i, int j){
		if ( ( i < 1 || i > gridSize) || ( j < 1 || j > gridSize) ) { // Corner Case Check 
		   throw new java.lang.IndexOutOfBoundsException("Indexes not within Range" + i + "," + j);
		}
		int arrayPosition = ( (i-1) * gridSize ) + (j-1);
		// Check if it is connected to any site in the top row
			if ( isOpen (i,j)) { // 		   
				for( int pos=0; pos < gridSize; pos++){
					if ( grid [pos] ) { //  if the position is open
				   		if ( uf.connected ( pos, arrayPosition) ) { // 
				   		   return true;
				   		}
					}
				}
			}
			return false;
	}
	
	/*
	* Checks if the System Percolates
	*/	
	public boolean percolates(){
		/*
		*Take the last row and check if there is any full site. If so, the system percolates.
		*/
		int row = gridSize;
		int col = 1;
		// Check the last row. --> the bottom row.
		for(; col <= gridSize ; col ++){
			if ( isFull (row, col)) { //  Check if the given site is full site;
			   return true;
			}
		}
		return false;
	}
	
	/*
	* Unit testing.
	*/
	public static void main(String[] args){

	
		/*
		* Test - 3 * 3 grid.
		*/		
	//	Percolation gridObject = new Percolation (3);
		
		/*
		* Open Test Case.
		*/
		
		// Positive
	//	gridObject.open(1,1);
	//	System.out.println("Open : (1 , 1) =>" + gridObject.isOpen(1,1));
		
		//Negative
	//	System.out.println("Open : (2 , 2)  " + gridObject.isOpen(2,2));
		
		// isFull Test Case.
		
		//Positive
	//	gridObject.open(2,1);		
	//	System.out.println(" Full : (2,1) => " + gridObject.isFull(2,1));
		
		
		//Negative
	//	System.out.println(" Full : (2,2) => " + gridObject.isFull(2,2));

		// Percolates Test case.
		
		// Negative
	//	gridObject.open(3,3);
	//	System.out.println("Percolates : " + gridObject.percolates());
		
		// Positve.
	//	gridObject.open(3,1);
	//	System.out.println("Percolates : " + gridObject.percolates());	
	
	}

}
