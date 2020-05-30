package arrayques;
import java.util.*;
public class matrixsearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int x=sc.nextInt();
		System.out.print(searchmatrix(a,m,n,x));
	}
	 
	public static  int searchmatrix(int a[][],int m,int n,int x)
	{
		int i=0,j=n-1;
		while(i<m&&j>=0)
		{
			if(a[i][j]==x)
			{
				return 1;
			}
			if(j==0)
			{
				i++;
				j=n-1;
			}
			else
				j--;
		}
		
		return 0;
	}

}
