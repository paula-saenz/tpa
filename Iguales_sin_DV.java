
public class Iguales_sin_DV {

	public static void main(String[] args) {

		  int[][] matriz1 = {{1, 5, 3},{4, 5, 6},{4, 5, 6}};
		  int[][] matriz2 = {{1, 2, 3},{4, 6, 6},{4, 5, 6}};
		  boolean iguales = true;
		  int i=0;
		  int j=0;
		  
		  if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
	            iguales = false;
	        } else {
	        	while(iguales == true && i == matriz1.length) {
	        		j=0;
	        		while (j == matriz1[i].length) {
	  				  if (matriz1[i][j]!= matriz2[i][j]) {
	  					  iguales = false;
	  				  }
	  				  j++;
	  			  }
	  			  i++;
	  		  }
	        	
	        	}
		  
		  System.out.println("las matrices son iguales: "+ iguales);
	        }
			  
		        
	}


