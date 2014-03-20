/**
 *  input : aaaabbbcccc 
 *  output: abc
 */
package StringExercises;

/**
 * @author Salaikumar
 *
 */
public class RemoveDuplicate {

	public String removeDup(String inputString){
		
		char[] input = inputString.toCharArray();
		int Index = 1;
		
		for (int i = 1; i < input.length; i++) {
			
			input[Index-1] = input[i-1];
			if( input[i] != input[i-1]){
				Index++;
			}
		}
		
		System.out.println(input.length);
		System.out.println(new String(input , 0 ,Index));
		
		return new String(input , 0, Index);
		
	}
	
	public static void main(String args[]){
		
		RemoveDuplicate rd = new RemoveDuplicate();
		
		rd.removeDup("SSAALLAAIIIIKKKKUMMARRRR");
		rd.removeDup("AAAAASSSHHHWWWAANNNTTTHH");
		
	}
}
