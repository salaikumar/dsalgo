package dataStructures;
/*
 *  Queue 
 */
class _queue{
	
	Integer maxSize;
	Integer nElements;
	Integer[] Q ;
	Integer front;
	Integer rear;
	
	public _queue( int maxS){
		
		maxSize = maxS;
		
		Q = new Integer[maxSize];
		
		nElements = 0;
		
		front = 0;
		
		rear = -1;
		
		
	}
	
	/*
	 *  Implementation including the Wrap Around part.
	 */
	public void insert(int element){
		
		// Check if the Queue is full 
		if ( rear == maxSize - 1  && front == 0){
			
			System.out.println("Queue is full!");
			
		}
		else
		{	
			// Wrap Around Insertions
			if( rear == maxSize - 1){
				
				rear = -1;
				
				Q[++rear] = element;
				nElements++;
			}
			// Normal Insertions
			else {
				
				Q[++rear] = element;
				nElements++;
			}
			
		}
	}
	
	
	public Integer remove(){
		
	  int temp = Q[front++];
	  
	  if( front == maxSize){
		  
		  front = 0;
	  }
	  
	  nElements--;
	  
	  return temp;
		
	}
	
	
	public Integer peekFront(){
		
		return Q[front];
	}
	
//	public Integer queueSize(){
		
		
		
	//}
	
}



public class queue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
