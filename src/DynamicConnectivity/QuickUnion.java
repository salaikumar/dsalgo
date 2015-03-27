/**
 * 
 */
package DynamicConnectivity;

/**
 * @author Salaikumar
 *  This class implements another method to solve Dynamic connectivity problem
 *  Here the Union operation is faster
 *  Follows the Root Concept to implement Union
 */
public class QuickUnion {
	
	int[] connectedComponents;
	
	public QuickUnion(int n){
		
		connectedComponents = new int[n];
		
		//initialize all to Self Connected Components
		for(int i = 0 ; i < n; i++){
			
			connectedComponents[i] = i;
		}
	}
	
	/*
	 * Finds the roor
	 */
	public int root(int x){
		
		int root = x;
		
		while ( root != connectedComponents[root])
			root = connectedComponents[root];
		
		return root;
	}
	/*
	 * Creates a connection between two points
	 */
	public void union(int x , int y){
	
		int xid = root(x);
		int yid = root(y);
		
		connectedComponents[xid] = yid;
	}
	
	/*
	 * Checks if two points are connected
	 * Find if both have same root.
	 */
	public boolean find(int x, int y){
		return root(x) == root (y);	
	}

}
