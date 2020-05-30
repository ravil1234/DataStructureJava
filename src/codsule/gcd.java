package codsule;
import java.util.*;
public class gcd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int min=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(min<a[i])
				min=a[i];
		}
		int  i=min;
	    while(true)
		{
	    	int c=0;
	    	for(int j=0;j<n;j++)
	    	{
			if(a[j]%i==0)
			{
				c=1;
			}
			else
			{
				c=0;
				break;
			}
	       }
	    	if(c==1)
	    	{
	    		break;
	    	}
			i--;
		}
     System.out.print(i);
	}

}
