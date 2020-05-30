package DAILYCODE;
import java.util.*;
public class sid_permutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int k=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]<a[j]&&c[j]!=-1)
				{
					b[k]=j+1;
	                 c[j]=-1;
	                 k++;
	                 break;
				}
				else
				{
					count++;
					if(count==n)
					{
						b[k]=-1;
						k++;
					}
				}
				
			}
		}
 for(int i=0;i<k;i++)
 {
	 System.out.print(b[i]+" ");
 }
	}

}
