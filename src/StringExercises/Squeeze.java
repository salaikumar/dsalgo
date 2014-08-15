/**
 * Squeezes the extra spaces between words in using Java.
 * Eg : I/P :Salaikumar will be a   scientist   someday
 *      O/P :Salaikumar will be a scientist someday
 */
package StringExercises;

/**
 * @author Salaikumar
 *
 */
public class Squeeze {
	
	char[] inputString;
	
	public Squeeze(String input){
	
		int Index = 1; 
		// Convert it to char array.
		inputString = input.toCharArray();
		
		//Loop through it and remove the consecutive chars with null.
		for (int i = 1; i < inputString.length; i++) {
			
			// Copy that character
			inputString[Index] = inputString[i];
			
			if(inputString[i] != ' '){
				
				Index++;
			}
			else if( inputString[Index-1] != ' '){
				
				Index++;
			}
			
		}
		
		// Make a new String with this newly created Character Array.
		String outputString = new String( inputString , 0 , Index );
		System.out.println(outputString);
		
	}
	
}
