package arrayques;
import java.util.*;
public class goodsubaaray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int count=0;
			long sum=0;
		    int j=0;
			for(int i=0;i<n;i++)
			{
					sum=sum+a[i];
					if(sum%n==0)
					{
						count++;
					}
					if(i==n-1)
				    {
				    	if(j<=n-1)
				    	{
				    		i=j;
				    		sum=0;
				    		j++;
				    	}
				    	else
				    		break;
			
				    }
					
			}
		
			System.out.println(count);
			t--;
		}

	}

}
