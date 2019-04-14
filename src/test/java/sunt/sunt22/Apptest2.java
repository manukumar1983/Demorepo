package sunt.sunt22;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Apptest2 {
	
	 @Test
	    public void sum()    
	     {
	    	System.out.println("SUM");
	    	int a=10;
	    	int b=20;
	    	
	    	AssertJUnit.assertEquals(30,a+b);   	
	    	
	        
	    }
	   
	    @Test
	    public void multiplt() {
	    	
	    	System.out.println("Mult");
	    	int a=10;
	    	int b=20;
	    	
	    	AssertJUnit.assertEquals(200,a*b); 
	    	
	    }
	    
	    @Test
	    public void subtract() {
	    	
	    	System.out.println("Subtract");
	    	int a=10;
	    	int b=20;
	    	
	    	AssertJUnit.assertEquals(10,b-a); 
	    	


}
}
	    
