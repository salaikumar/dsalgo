/**
 * 
 */
package DynamicConnectivity;

/**
 * @author Salaikumar
 *  This class implements another method to solve Dynamic connectivity problem
 *  Here the Union operation is faster and uses Weight.
 *  Follows the Root Concept to implement Union
 *  Based on the weight of the tree, the Union is performed
 */
public class WeightedQuickUnion {
	
	// Connected Components;
	int[] connectedComponents;
	
	int[] size;
	
	public WeightedQuickUnion(int n){
		
		connectedComponents = new int[n];
		size = new int[n];
		
		//initialize all to Self Connected Components
		//Set the initial size of all individual components to one
		for(int i = 0 ; i < n; i++){
			connectedComponents[i] = i;
			size[i] = 1;
		}
		
		
		
	}
	
	/*
	 * Finds the root
	 */
	public int root(int x){
		
		int root = x;
		while ( root != connectedComponents[root]){
			
			// Path Compression Code
			// Makes a  jump
			connectedComponents[root] = connectedComponents[connectedComponents[root]];
			
			root = connectedComponents[root];
			
		}
		return root;
	}
	
	
	/*
	 * Creates a connection between two points
	 */
	public void union(int x , int y){
	
		int xid = root(x);
		int yid = root(y);
		
		if(size[xid] <= size[yid]){
			
			connectedComponents[xid] = yid;
			size[yid] += size[xid];
		}
		else{
			
			connectedComponents[yid] = xid; 
			size[xid] += size[yid];
		}
		
		
		
	}
	
	/*
	 * Checks if two points are connected
	 * Find if both have same root.
	 */
	public boolean find(int x, int y){
		return root(x) == root (y);	
	}

}
