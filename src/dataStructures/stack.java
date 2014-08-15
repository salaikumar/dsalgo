package dataStructures;

/*
 * The Stack class
 */
class _stack{
	
	// Maximum Size of Stack 
	int maxSize;
	
	//Stack Elements
	long[] stackElements;
	
	//Top Pointer
	int top;
	
	/*
	 * Initiate the Stack 
	 */
	public _stack(int mS){
		
		maxSize = mS;
		
		stackElements = new long[maxSize];
		
		top = -1;
		
		
	}
	
	/*
	 * Checks if the Stack is empty
	 */
	public boolean isEmpty(){
		
		if(top == -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	/*
	 * Push an element into the Stack
	 */
	public void push(long element){
		
		
		if( top != maxSize-1){
			
			stackElements[++top] = element;
			
		}
		else{
			
			System.out.println("Stack is full. You are running out of memory");
		}
	}
	
	/*
	 * Pops the top element from Stack
	 */
	public long pop(){
		
		if( !isEmpty()){
			
			return stackElements[top--];
		}
		else{
			
			return -1;
		}
	}
	
	/*
	 *  Returns the Top element in the Stack
	 */
	public long peek(){
		
		if (! isEmpty()){
			
			return stackElements[top];
		}
		else{
			return -1;
		}
	}
	
	public void printStack(){
		
		
		if( !isEmpty()){
			System.out.println("*********************************");
			
			for( int i = top ; i > -1 ; i--){
				
				System.out.println( stackElements[i] + " ");
			}
			
			System.out.println("*********************************");
			
		}
		else{
			
			System.out.println("Stack is Empty Now!");
		}
		
	}
	
}



/*
 * The Stack Driver class
 */
public class stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create the Stack Instance
		_stack sk = new _stack(10);
		
		// Push elements in Stack
		sk.push(202020);
		sk.push(303949320);
		sk.push(878879);
		sk.push(878870);
		sk.push(878878);
		sk.push(878877);
		sk.push(878876);
		
		// Print Stack
		sk.printStack();
		
		// Pop some elements
		sk.pop();
		sk.pop();
		
		// Peek
		long peepElement = sk.peek();
		
		System.out.println(peepElement);
		
		sk.printStack();
		
		
		
		
		

	}

}
