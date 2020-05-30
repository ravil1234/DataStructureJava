package DynamicProgramming;
import java.util.*;
public class kanapsack_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int w[][]=new int[n+1][s+1];
		for(int j=0;j<=s;j++)
		{
			w[0][j]=0;
		}
		for(int i=0;i<=n;i++)
		{
			w[i][0]=0;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=s;j++)
			{
				
				if(j<a[i-1])
				{
					w[i][j]=w[i-1][j];
				}
				else if(a[i-1]==j)
				{
					w[i][j]=b[i-1];
				}
				else
				{
					w[i][j] = Math.max(w[i-1][j],b[i-1]+w[i-1][j-a[i-1]]);
				}
				
			}
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=s;j++)
			{
				System.out.print(w[i][j]+" ");
			}
			System.out.println();
		}
     System.out.println(w[n][s]);
	}
}
