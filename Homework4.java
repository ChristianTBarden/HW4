import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Homework4 {
	public static void main(String[] args){
	
//-------------------------------------------------------------------------		
//1)		Prints elements of int Array
		          basicArray();
		 
		 
///-----------------------------------------------------------------------		 
//2)		prints elements of String Array
		 
  printElements1("\n" + "WuTangClan,\t", "BoneN'Thugs,\t", "MosDef\t");
	
  
		
///-----------------------------------------------------------------------			
//3)		Prints 2D Matrix
        int[][] bat = {{1,0,0,1},
		              {1,0,0,1}};
		
	    printElements2(bat); 
	    
//-------------------------------------------------------------------------    
//4) Prints out Array of time objects however coundn't print out as string.
// Used Arrays.toString() didn't work
	    
	    Time one = new Time(8);
	    
	    Time two = new Time(7);
	    
	    Time three = new Time (6);
	    
	    Time[] wizkid = {one,two,three};
	    
	    printElements3(wizkid);
	    
	    System.out.println();
	    
//-------------------------------------------------------------------	    
//5)  Prints out the string elements and their length
	    String[] tenstrings = {"first","second","third","fourth",
	    		"fifth","sixth","seventh","eighth","nineth","tenth"};
	        
	      printElements4(tenstrings);
	      System.out.println();
	    

	    
//-------------------------------------------------------------------
//6)         Prints out three time objects with customized time
	    
	      Time one1 = new Time(17, 3, 50 );
		    
		    Time two2 = new Time(24,4,9);
		    
		    Time three3 = new Time(32,3,9);
		    
		    Time[] wizkid2 = {one1,two2,three3};
	    
		    printElements3( wizkid2);

	    
//-------------------------------------------------------------------
//7)	    prints out rows / columns of 2 array and  tell their respective lengths.
		    
	    int[][] LastPart = new int [10][20];
	    
	    // array column length
	    
	   int x = LastPart[0].length;
	   
	    //print column length
	   
	    System.out.println("\ncolumn length\r\n" + "	" + x);
	    
	    // array row length
	    
	    int c = LastPart.length;
	    
	     //print row length
	    
	    System.out.println("\nrow length\r\n" + "	" + c + "\n");
	     
	    printElements2(LastPart);
	}
	    
	 
	        public static void basicArray(){
			
			int[][] nums = {{1,2,3,4,5,6,7,8,9,10},
					       {11,12,13,14,15,16,17,18,19,20},
					       {21,22,23,24,25,26,27,28,29,30},
					       {31,32,33,34,35,36,37,38,39,40},
					       {41,42,43,44,45,46,47,48,49,50}};
			
                 for (int row = 0; row < nums.length; row++) {
            	 for(int col = 0; col < nums[0].length;col++) {
            		 
            		 
            	System.out.println(nums[row][col]);	 
            		 
            	 }
             }
             }
	
			public static void printElements1(String x, String y, String z){
				
			 String[] arr = {x,y,z};
			
			 String c = arr[0];
			 
			 String v = arr[1];
			 
			 String p = arr[2];
			 
			 System.out.println(c + v + p + "\n");
			 
			 
			}
			
			 public static void printElements2(int[][] arr2){
				 
				 
				  for (int row = 0; row < arr2.length; row++) {
		            	 for(int col = 0; col < arr2[0].length; col++) {
		            		 
		            	 System.out.printf(arr2[row][col] + " ");
		            	 }
		            	 System.out.printf("\n");
		            
}         System.out.println('\n');
				  }
			 
			 public static void printElements3(Time[] x) {
				 
				 for (int row = 0; row < x.length; row++) {
				  
					 String s = x[row].toString();
					 
					 System.out.println(s);
					 }
				   
				     }
                
			 
                
      public static void printElements4(String[] x) {
				   
				 for (int row = 0; row < x.length; row++) {
					 
					 String one = x[row];
					 
				     int length = one.length();
				       
					 System.out.println( x[row] + ", " +" String Length:" + length); 
					 
					 
				 
				 } 
				 
				    	
			        }}

      

			
			 
	 
			     
			
				
				
				
				  	
				
				
			
			
			
		
	
	
	
	
	


