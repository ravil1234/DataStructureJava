package DynamicProgramming;
import java.util.*;
public class klcs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int m=sc.nextInt();
	        int k=sc.nextInt();
	        int a[]=new int[n];
	        int b[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	        	a[i]=sc.nextInt();
	        }
	        for(int i=0;i<m;i++)
	        {
	        	b[i]=sc.nextInt();
	        }
	       int MAX=10;
	        long dp[][][]=new long[10][10][10];
	        for (int i = 0; i < MAX; i++) 
	            for (int j = 0; j < MAX; j++) 
	                for (int l = 0; l < MAX; l++) 
	                    dp[i][j][l] = -1; 
	     System.out.println(klc(dp,a,b,k,0,0));
	}
public static long klc(long dp[][][],int a[],int b[],int k,int i,int j)
{
    if(i>=a.length||j>=b.length)
    	return 0;
    
    long an=dp[i][j][k];
    if(an!=-1)
    {
    return an;	
    }
   long ans=0;
    if(a[i]==b[j])
    {
    	ans = 1+klc(dp,a,b,k,i+1,j+1);
    }
    else
    {
    	if(k>0)
    	{
    		ans=1+klc(dp,a,b,k-1,i+1,j+1);
    	}
    	ans=Math.max(ans,klc(dp,a,b,k,i+1,j));
    	ans=Math.max(ans,klc(dp,a,b,k,i,j+1));	
    	 
    }
    dp[i][j][k] = ans;
    return ans;
}
}
