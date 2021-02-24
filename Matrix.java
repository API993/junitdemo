package java_assignment;
import java.util.*;

public class Matrix 
{
	private static  Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) 
	{		
		  boolean loop = true;
		while(loop)
		{
           System.out.println("1.ADD .SUB 3.MULTIPLY 4.SQUARE 5.EXIT ENTER OPTIONS\n");
           int choice  = sc.nextInt();
           while(choice < 1 || choice > 5)
           {
        	  System.out.println("INVALID CHOICE!! ENTER AGAIN");
         	  choice = sc.nextInt();
           }
           
           if(choice == 5)
        	   return;
           
           
         System.out.println("ENTER ROWS AND COLS OF FIRST MSTRIX");
   		int row1 = sc.nextInt();
   		int col1 = sc.nextInt();
   		
   		System.out.println("ENTER ROWS AND     COLS OF Second MSTRIX");
   		int row2 = sc.nextInt();
   		int col2 = sc.nextInt();
   		
   		int[][] mat1 = new int[row1][col1];
   		int[][] mat2 = new int[row2][col2];
   		
         input(mat1,mat2);
           
          switch(choice)
          {
             case 1:
            	 add(mat1,mat2);
            	  break;
            	
             case 2:
            	 sub(mat1,mat2);
            	 break;
            	 
             case 3:
            	 mul(mat1,mat2);
            	 break;
            	 
             case 4:
                 sq(mat1,mat2);
            	 break;
            	 
             case 5:
            	 loop = false;
                 break;
          }
		}
       
       System.out.println("EXITING THE PROGRAM\n");
       
       //end of main
	}
	
	public static void add(int[][] mat1,int[][] mat2)
	{
		 if(mat1.length !=mat2.length || mat1[0].length != mat2[0].length)
		 {
			 System.out.println("ROW/COL NOT SAME CANT ADD !");
		     return;
		 }
		 
		 int[][] res = new int[mat1.length][mat1[0].length];
		 for(int i=0;i<mat1.length;i++)
		 {
			 for(int j=0;j<mat1[0].length;j++)
			 {
				 res[i][j] = mat1[i][j] + mat2[i][j];
			 }
		 }
		display(res);
	}
	
	public static void sub(int[][] mat1,int[][] mat2)
	{
		 if(mat1.length !=mat2.length || mat1[0].length != mat2[0].length)
		 {
			 System.out.println("ROW/COL NOT SAME CANT SUB !");
		     return;
		 }
		 
		 int[][] res = new int[mat1.length][mat1[0].length];
		 for(int i=0;i<mat1.length;i++)
		 {
			 for(int j=0;j<mat1[0].length;j++)
			 {
				 res[i][j] = mat1[i][j] - mat2[i][j];
			 }
		 }
		display(res);
	}
	
	
	public static void mul(int[][] mat1,int[][] mat2)
	{
		 if(mat1[0].length !=mat2.length)
		 {
			 System.out.println("Not SAME CANT MULTIPLY !");
		     return;
		 }
		 
		 long[][] res = new long[mat1.length][mat2[0].length];
		
		 for(int i = 0 ; i < mat1.length; i++)
		 {
			 for(int j=0; j< mat2[0].length;j++)
			 {
				 for(int k=0;k<mat2.length;k++)
				 {
					 res[i][j] += mat1[i][k] * mat2[k][j];
				 }
			 }
		 }		 
		display(res);
	}
	
	
	public static void sq(int[][] mat1,int[][] mat2)
	{
		long[][] res1 = new long[mat1.length][mat1[0].length];
		long[][] res2 = new long[mat2.length][mat2[0].length];
		
		  for(int i=0;i<mat1.length;i++)
		  {
			  for(int j=0;j<mat1[0].length;j++)
			  {
				  res1[i][j] = mat1[i][j]*mat1[i][j];  
			  }
		  }
		 
		  for(int i=0;i<mat2.length;i++)
		  {
			  for(int j=0;j<mat2[0].length;j++)
			  {
				  res2[i][j] = mat2[i][j]*mat2[i][j];  
			  }
		  }
		 
		 display(res1);
		 display(res2);
	}
	
	public static void display(int[][] res)
	{
		System.out.println("RESULTANT MATRIX IS :");
		
		for(int i=0;i<res.length;i++)
		{
			for(int j =0 ;j<res[0].length;j++)
			{
				System.out.print(res[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static void display(long[][] res)
	{
		System.out.println("RESULTANT MATRIX IS :");
		
		for(int i=0;i<res.length;i++)
		{
			for(int j =0 ;j<res[0].length;j++)
			{
				System.out.print(res[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	
	public static void input(int[][] mat1,int[][] mat2)
	{
		System.out.println("ENTER 2 MATRICES TO BE ADDED\n");
		System.out.println("INPUT FIRST MATRIX\n");
		 
		   for(int i=0;i<mat1.length;i++)
		   {
			   for(int j=0;j<mat1.length;j++)
			   {
				   System.out.println("ENTER MAT1[" + i+1 + "][" + j+1 + "]");
				   mat1[i][j] = sc.nextInt();
			   }
		   }
		 
	    System.out.println("INPUT FIRST MATRIX\n");
		   for(int i=0;i<mat2.length;i++)
		   {
			   for(int j=0;j<mat2.length;j++)
			   {
				   System.out.println("ENTER MAT2[" + i+1 + "][" + j+1 + "]");
				   mat2[i][j] = sc.nextInt();
			   }
		   }	
	}
	
}
