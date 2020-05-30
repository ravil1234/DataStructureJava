package DAILYCODE;
import java.util.*;
public class akasharray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
	    int a[]=new int[m];
	    int b[]=new int[n];
	    int c[]=new int[k];
	    for(int i=0;i<m;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    for(int j=0;j<n;j++)
	    {
	    	b[j]=sc.nextInt();
	    }
	    for(int i=0;i<k;i++)
	    {
	    	c[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    Arrays.sort(b);
	    Arrays.sort(c);
	    int m1=0,n1=0,k1=0;
	    int min=0;
	    int cmin=0;
	    min=Math.abs(Math.max(a[m1], Math.max(b[n1],c[k1]))-Math.min(a[m1], Math.min(b[n1],c[k1])));
		while(m1<m&&n1<n&&k1<k)
		{
		cmin=Math.abs(Math.max(a[m1], Math.max(b[n1],c[k1]))-Math.min(a[m1], Math.min(b[n1],c[k1])));
		int max=Math.min(a[m1], Math.min(b[n1],c[k1]));
		   if(cmin<min)
		   {
			   min=cmin;
		   }
		   if(max==a[m1])
		   {
			   m1=m1+1;
		   }
		   else if(max==b[n1])
		   {
			   n1=n1+1;
		   }
		   else if(max==c[k1])
		   {
			   k1=k1+1;
		   }	   
		}
		System.out.println(min);
	}
}
