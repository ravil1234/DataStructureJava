package DAILYCODE;
import java.util.*;
public class CODECHEF4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();		
		}
	    Arrays.sort(a);
	    long max=0,max1;
	    for(int i=0;i<n;i++)
	    {
	    	max1=(n-i)*a[i];
	    	if(max<max1)
	    	{
	    		max=max1;
	    	}
	    }
      System.out.print(max);
	}

}
