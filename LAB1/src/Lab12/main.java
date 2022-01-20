package Lab12;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		
	
		
		System.out.print("Please enter your value : ");

	       int n;
	       
	       Scanner scanIn = new Scanner(System.in);
	       n = scanIn.nextInt();
	       scanIn.close();            
	       
	    System.out.println(" ");
	    System.out.println("-----------------------");
	    
	 
	    
	    for(int x = 2 ; x <= n ; x++) {
	    	
	    	int[] ham = new int[999];
		   
		    int cout = 0;
		    
		    for(int i = 1; i <= x ; i++ ) {
		    	
		        if( x % i == 0 ) {
		    		ham[i] = i;
		    		//System.out.println( "i = " + i);
		    		//System.out.println( "ham = " + ham[i]);
		    		cout++;
		    	//	System.out.println( "cout = " + cout);
		    	}
		      
		    }//enf for
		    int cout2 = 2;
		    
		       if(cout <= 2) {
		    	
		    	System.out.print(x + " = Prime Number");
		    	
		    } else {
		    	
		   	System.out.print(x + " = Not Prime : Divide by");
		   	
		    	 for(int i = 2; i <= n  ; i++ ) {
		    		 
		    		
		    		
		    		 if( cout2  == cout - 1 && ( ham[i] != 0 && ham[i] != x) ) {
		    			 
		    			 System.out.print(" " + ham[i]  );
		    			 
		    			 
		    		 }else if(cout2  != cout - 1 && ( ham[i] != 0 && ham[i] != x ) ) {
		    			 
		    			 System.out.print(" " + ham[i] +"," );
		    			 cout2++;
		    			 
		    		 }
		    		 
		    		 
		    	//	 System.out.println( "" );
		    //	System.out.println( "cout2 = " + cout2 + " == "+ (cout - 1));
		    	 
		    	 }//ent for
		    	
		    }
	    	
		     //  x--;
		       System.out.println("");
		    
	    }//end LOOP 1
	    
	

	    
	    
	    
	}//end fn

}


