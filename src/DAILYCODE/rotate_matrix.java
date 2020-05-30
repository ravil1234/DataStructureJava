package DAILYCODE;
import java.util.*;
public class rotate_matrix 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
		     a[i][j]=sc.nextInt();		
			}
		}
      for(int i=0;i<n;i++)
      {
    	  int k=0;
    	  for(int j=n-1;j>=0;j--)
    	  {
              b[k][i]=a[i][j];
            k++;
        }
	}
      for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
		     System.out.print(b[i][j]+" ");		
			}
			System.out.println();
		} 
  }

}
