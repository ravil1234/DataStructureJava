package STACKQUEUEchallenge;
import java.util.*;
public class gratestno2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        	b[i]=-1;
        }
        for(int i=0;i<n;i++)
        {
        	int c=0;
        	for(int j=i+1;j<n;j++)
        	{
        		if(j==n-1&&c==0)
        		{
        			c=1;
        			j=0;
        		}
        		if(a[i]<a[j])
        		{
        			b[i]=a[j];
        			break;
        		}
        	}
        }
        for(int i=0;i<n;i++)
        {
        	System.out.print(b[i]+" ");
        }
       
       
     }
  }