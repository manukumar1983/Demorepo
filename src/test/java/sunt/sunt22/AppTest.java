package sunt.sunt22;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
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
