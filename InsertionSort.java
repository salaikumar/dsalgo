import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort {
   
    static int s;
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        String input = new String (in.nextLine());
        Scanner value = new Scanner(input);
        s = value.nextInt();
        
        int[] arr = new int[s];
        int i =0;
        input = in.nextLine();
        value = new Scanner(input);
        while(value.hasNextInt()){
            arr[i]= value.nextInt();
            i++;
        }
        
        insertIntoSorted(arr);
        
    }
        
   

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int V = ar[s-1];
	System.out.println("Value="+V);
        int i = s-2;
        while( i >= 0){
            
	    if(ar[i] > V){

		    ar[i+1] = ar[i];
		    printArray( ar );
             	    i--;
            }
	    else{
		break;
	    }
		

        }
        ar[i+1]=V;
        printArray(ar);
        
    }
    
    
/* Tail starts here 
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
  */
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}

