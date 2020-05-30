package backtracking;
import java.util.*;
public class SUDOKU {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		if(sudoku(a,0,0))
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	  }
public static boolean sudoku(int a[][],int i,int j)
{
  if(i==a.length)
  {
	  //base case
	  return true;
  }
  if(j>=a[0].length)
  {
	  return sudoku(a,i+1,0);
	  //recursive case
  }
  if(a[i][j]!=0)
  {
	  return sudoku(a,i,j+1);
  }
 
	for(int k=1;k<=9;k++)
	{
		if(issafe(a,i,j,k))
		{
			a[i][j]=k;
			boolean p=sudoku(a,i,j+1);
		    if(p)
		    	return true;
		}
	}
	 a[i][j]=0;
	  return false;
  
}
public static boolean issafe(int a[][],int i,int j,int val)
{
	int x=(i/3)*3;
	int y=(j/3)*3;
	for(int l=x;l<x+3;l++)
	{
		for(int m=y;m<y+3;m++)
		{
			if(a[l][m]==val)
				return false;
		}
	}
	for(int l=0;l<a[0].length;l++)
	{
		if(a[l][j]==val||a[i][l]==val)
			return false;
	}
	return true;
}
}
