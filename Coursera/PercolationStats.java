/*
* Percolation Stats. 
* Monte Carlo Simulation
*/

import java.io.*;
import java.lang.*;
import java.util.Random;
public class PercolationStats{
	
	/*
	* Properties
	*/
	private double 	thresholdValues[];     // Fraction of the OpenSites at each Experiment
	private double 	mean;		       // Mean Value of the Complete Experiment
	private double 	stddev;		       // Standard Deviation Value of  the complete experiment
	private double 	confidenceLo;	       // Confidence low Value
	private double 	confidenceHi;	       // Confidence High Value
	/*
	*  Constructor
	*/
	public PercolationStats(int N, int T){
		if (N <= 0 || T <=0) { // 
		   throw new java.lang.IllegalArgumentException("The Grid size can't be negative or zero");
		}
		
		/*
		* Initialize the properties
		*/
		thresholdValues   = new double[T];
		
		/*
		* Run the experiment
		*/
		for(int i=0; i < T ; i++){
			//System.out.println("Experiment : " + i);
			
			
			Percolation percolation = new Percolation (N);
			int openSites = 0;
			while( ! percolation.percolates() ){
				Random rand = new Random();
				int row = rand.nextInt((N-1)+1)+1;
				int col = rand.nextInt((N-1)+1)+1;
				if ( ! percolation.isOpen(row, col) ) { // If the site is not already open, open it. 
				   	percolation.open(row, col);
				   	openSites++;
				}
			}	
			
			// Calculate the Fraction part of it.
			thresholdValues[i] = (double)openSites/(N * N);
			openSites= 0;
		}
	      // Using Standard Library function to calculate the mean 
	      mean = StdStats.mean(thresholdValues);
	      
	      // Calculate Standard Deviation.
	      stddev = StdStats.stddev(thresholdValues);
	      
	      // Calculate confidence Lo	
	      confidenceLo = (	mean - (	( 1.96 * Math.sqrt(stddev))/ (Math.sqrt(T) )	) );
	      
	      // Calculate Confidence Hi
	      confidenceHi = (	mean + (	( 1.96 * Math.sqrt(stddev))/ (Math.sqrt(T) )	) );
	      
	}	
	
	/*
	* Mean - Calculate the Mean
	*/
	public double mean(){
		return mean;      		
	}
	
	/*
	*  Standard Deviation
	*/
	public double stddev(){
		return stddev;	
	}
	
	/*
	* Confidence Lo  Calculation
	*/
	public double confidenceLo(){
		return confidenceLo;
	}
	
	/*
	* Confidence Hi
	*/
	public double confidenceHi(){
		return confidenceHi;
	}
	
	/*
	* Unit Testing.
	*/
	public static void main(String[] args) {
		// Read the Command line Arguments and run the test accordingly
		PercolationStats  experiments;
				 
		experiments  =  new PercolationStats(Integer.parseInt(args[0]), Integer.parseInt(args[1]));		   
		/*
		* Print the Output
		*/		
		System.out.println("mean    = " + experiments.mean());
		System.out.println("stddev  = " + experiments.stddev());
		System.out.println("95% confidence level  = "
			  		 + experiments.confidenceLo() + "," + experiments.confidenceHi());		
	}
}	
