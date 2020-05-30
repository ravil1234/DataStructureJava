package pritampurabatch;
import java.util.*;
public class alex_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			b[i]=a[i];
		}
       int q=sc.nextInt();
        while(q!=0)
        {
        	int x=sc.nextInt();
            for(int i=0;i<n;i++)
            {
            	int j=i;
            	int x1=x;
            	while(x1!=0)
            	{
            		if(j==0)
            		{
            			j=n;
            		}
            		j=j-1;
            		x1=x1-1;
            	}
            	a[i]=b[i]+b[j];
            }
            for(int i=0;i<n;i++)
            {
              b[i]=a[i];
            }
            q--;
        }
        long sum=0;
        for(int i=0;i<n;i++)
        {
        	sum=sum+a[i];
        }
       sum=sum%((long)Math.pow(10, 9)+7);
        System.out.println(sum);
	}

}
