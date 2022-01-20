package Lab11;


import java.util.Scanner;



public class main {

	public main() {
	
		
	}//end fn

	
	
	
	
	public static void main(String[] args) {

		
		
		System.out.print("Please enter your value : ");

	       int n;
	       Scanner scanIn = new Scanner(System.in);
	       n = scanIn.nextInt();
	       scanIn.close();            
	       
	    System.out.println(" ");
	    System.out.println("-----------------------");
	    
	   
	    for ( int i = 1 ; i <= n ; i++){
	        if(i % 5 == 0 ) {
	    	System.out.print( i );
	    	System.out.println();
	        } else {
	        System.out.print(i + ",");
	        }
	        
	        
	        
	    }//enf for

	

	}//end fn

}
