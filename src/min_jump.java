import java.util.*;
public class min_jump {
	public static void main(String[] args) {
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
			int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[0]==0)
			{
				count=Integer.MAX_VALUE;
				break;
			}

			int s=i+1;
			if(a[i]>=(a.length-i-1))
			{
				count++;
				break;
			}
			else
			{
	           int g=i+1;
	           int b[]=new int[a[i]];
	           int c[]=new int[a[i]];
	           int j=0;
	           for(j=0;j<a[i];j++)
	           {
	        	   b[j]=a[g];
	        	   c[j]=g;
	        	   g++;
	           }
	          for(int k=0;k<j;k++)
	          {
	        	  if(b[k]>=(a.length-1-c[k]))
	        	  {
	        		  break;
	        	  }
	        	  
	          }
	          int max=0;
	          for(int k=0;k<j;k++)
	          {
	        	  if(max<b[k])
	        	  {
	        		  
	        		  s=c[k];
	        	  }
	          }
			} 
			i=s-1;
			count++;
		}
		System.out.println(count);
			t--;
		}

	}

}
