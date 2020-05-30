package aug_challenge;
import java.util.*;
public class AUG_Q {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t!=0)
			{
				int n=sc.nextInt();
				int k=sc.nextInt();
				int a[]=new int[n];
				int b[]=new int[n];
				int g=0;
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
					if(a[i]==-1)
					{
					if(i==0||i==n-1)
					{
					}
					else
					{
						b[g]=i;
						g++;
					}
				}
			}
				if(a[0]==-1)
				{
					for(int j=1;j<=k;j++)
					{
						if(a[1]!=j)
						{
							a[0]=j;
							break;
						}
					}
				}
				if(a[n-1]==-1)
				{
					for(int j=1;j<=k;j++)
					{
						if(a[n-2]!=j)
						{
							a[n-1]=j;
							break;
						}
					}
					
				}
			   for(int i=0;i<g;i++)
			   {
					   for(int j=1;j<=k;j++)
					   {
						   if(a[b[i]+1]!=j&&a[b[i]-1]!=j)
							   a[b[i]]=j;
					   }
			   }
			   int count=0;
			   for(int i=0;i<n;i++)
			   {
				   if(a[i]==-1)
				   {
					   count=1;
					   System.out.println("No");
					   break;
				   }
			   }
			   if(count==0)
			   {
				   System.out.println("Yes");
				   for(int i=0;i<n;i++)
				   {
					   System.out.print(a[i]+" ");
				   }
				   System.out.println();
			   }
			t--;
	    }
	}
}
