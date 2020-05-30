package samsung_archives;
import java.util.*;
public class QUES1 
{
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
			 a[i]=sc.nextInt();
			}
			int j=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]<=0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					j++;
				}
			}
		for(int i=j;i<n;i++)
		{
		int item=Math.abs(a[i])+j-1;
		if(item<n&&a[item]>0)
		{
			a[item]=-a[item];
		}
	    }
		int c=0;
		for(int i=j;i<n;i++)
		{
			if(a[i]>=0)
			{
				c=1;
				System.out.println(i-j+1);
				break;
			}
		}
		if(c==0)
		System.out.println(n+1);
		t--;	
		}
	}
}
