package DAILYCODE;
import java.util.Scanner;
public class sid_permut {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int k=0,r=0;
		int count=n;
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
			c[i]=-1;
		}
        for(int j=0;j<n;j++)
        {
        	for(int i=1;i<=n;i++)
        	{
        		
        		if(b[j]>=i && c[k+1]==-1)
        		{
        			a[k]=i;
        			c[k]=i;
        			k++;
        			break;
        			}
        		}
              
        		if(b[j]==-1)
            	{
            		a[k]=count;
            		c[k]=count;
            		count-=1;
            		k++;
            		break;
            	}
        	}
        for(int i=0;i<k;i++)
        {
       	 System.out.print(a[i]+" ");
        }

	}

}
