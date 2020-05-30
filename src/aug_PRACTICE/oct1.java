package aug_PRACTICE;
import java.util.*;
public class oct1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int count=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int min=a[0];
			 count=1;
			for(int i=1;i<5;i++)
			{
				if(min>a[i])
				{
					count++;
					min=a[i];
				}
			}
			int j=0;
			for(int i=5;i<n;i++)
			{
				min=1000;
				for(int k=j;k<i;k++)
				{
					if(min>a[k])
					{
						min=a[k];
					}
				}
				if(min>a[i])
					count++;
				j++;
			}
		System.out.println(count);
			t--;
		}
	}
}
/*
count=1;
int min1=a[1];
int min=a[0];
int j=1;
for(int i=1;i<n;i++)
{
	if(min>a[i])
	{
		min=a[i];
		count++;
	}
	if(min1>a[i])
	{
		min1=a[i];
		if(min>min1)
			min=min1;
	}
     if(j==5)
     {
    	 j=0;
    	 min=min1;
    	 if(i+1<n)
    	  min1=a[i+1];
     }
     j++;
}
System.out.println(count);
*/