package DAILYCODE;
import java.util.*;
public class LASTINDEX {
	static int  count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int x=sc.nextInt();
	    index(a,0,x);
	    if(count==0)
	    	System.out.println(-1);

	}
	public static void index(int a[],int i,int x)
	{
		if(i==a.length)
		{
			return;
		}
	   index(a,i+1,x);
	   if(x==a[i])
		{
		   if(count==0)
		   {
			   count=1;
			System.out.println(i);
		   }
			return;
		}
	}

}
