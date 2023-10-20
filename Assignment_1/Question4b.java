
public class Question4b {

	public static void main(String[] args) {
		int rows = 6; 
		
		for (int i = 0; i < rows-1; i++) { 
			  
	        for (int k = 0; k <(rows - i) - 1; k++) { 
	        	System.out.print(" "); 
	        } 
	        
	        for (int j = 0; j <i; j++) { 
	            System.out.print("*"); 
	        } 
	        for (int j = 1; j <i; j++) { 
	            System.out.print("*"); 
	        } 
	        for (int k = 1; k <(rows - i) - 1; k++) { 
	        	System.out.print(" "); 
	        }
	  
	        System.out.println(""); 
	    } 
		  
	    for (int i = 0; i < rows; i++) { 
	  
	        for (int j = 0; j <i; j++) { 
	            System.out.print(" "); 
	        } 
	  
	        for (int k = 0; k <(rows - i) - 1; k++) { 
	        	System.out.print("*"); 
	        } 
	        for (int k = 1; k <(rows - i) - 1; k++) { 
	        	System.out.print("*"); 
	        } 
	        for (int j = 1; j <i; j++) { 
	            System.out.print(" "); 
	        } 
	  
	        System.out.println(""); 
	    } 

	}

}
