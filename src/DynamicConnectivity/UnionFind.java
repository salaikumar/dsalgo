/**
 * 
 */
package DynamicConnectivity;

/**
 * @author Salaikumar Saravanan
 * This Class holds the Implementation of Union find operations.
 * Union() = Establishes the connection between two points
 * Find() = Would tell if they are connected 
 */
public class UnionFind {
	
	
	int[] connectedComponents;
	
	/*
	 * Constructor
	 * n is the total number of elements 
	 */
	public UnionFind(int n){
		
		// Create a array of the req. size
		connectedComponents = new int[n];
		
		//Make each component as connected component
		for(int i=0; i<n; i++){
			
			connectedComponents[i] = i;
		}
		
	}
	
	/*
	 * Checks whether X and Y are connected
	 */
	public boolean find(int x, int y){
		return connectedComponents[x] == connectedComponents[y];
	}
	
	/*
	 *  Establishes a connection between the given points
	 *  Change the value of first one as per it is in second one.
	 */
	public void union(int x, int y){
	
		for(int i= 0; i<connectedComponents.length; i++){
			
			int xid = connectedComponents[x];
			int yid = connectedComponents[y];
			/*
			 *  Why don't I directly use that value? 
			 *  Professor says it as insidious bug.
			 *  How?
			 *  
			 */
			if ( connectedComponents[i] == xid) {
					connectedComponents[i] = yid;
			}
		}
	}
	

}
