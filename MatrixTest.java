package matrixjunit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class MatrixTest 
{
	private static Matrix obj;

	@BeforeAll
	 public  void beforeall()
	 {
		System.out.println("BeforeAll executed");
	     obj = new Matrix();	
	 }
	

	@Test
	  public void testadd()
	{
		int[][] mat1 = {{ 1, 2 }, { 3, 4 }};
		int[][] mat2 = {{ 1, 2 }, { 3, 4 }};
		int[][] mat3 = {{ 2, 4 }, { 6, 8 }};
		assertEquals(true,obj.valid(mat1,mat2));
		assertEquals(mat3,obj.add(mat1,mat2));	
		
	}
	
      @Test
	  public void testsub()
	{
    		int[][] mat1 = {{ 1, 2 }, { 3, 4 }}; 
    		int[][] mat2 = {{ 1, 2 }, { 3, 4 }};
    		int[][] mat3 = {{ 2, 4 }, { 6, 8 }};
    		assertEquals(false,obj.valid(mat1,mat2));
    		assertEquals(mat3,obj.add(mat1,mat2));		
	}

	  @Test
	  public void testmul()
	{
			int[][] mat1 = {{ 1, 2 }, { 3, 4 }}; 
			int[][] mat2 = {{ 1, 2 }, { 3, 4 }};
			int[][] mat3 = {{ 2, 4 }, { 6, 8 }};
			assertEquals(true,obj.valid(mat1,mat2));
			assertEquals(mat3,obj.valid(mat1,mat2));		
	} 
	  
	  @Test
	  public void testsq()
	{
			int[][] mat1 = {{ 2, 2 }, { 2, 2 }}; 
			int[][] mat2 = {{ 4, 4 }, { 4, 4 }};
			assertEquals(mat2,obj.sq(mat1));	
	}   
	  
	  @AfterAll()
	  public void afterall()
	  {
		   obj = null;
		   System.out.println("After All executed");
	  }
	  
}
