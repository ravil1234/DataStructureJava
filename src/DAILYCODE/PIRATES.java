package DAILYCODE;
import java.util.*;
public class PIRATES {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int t =sc.nextInt();
    while(t!=0)
    {
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	int k=sc.nextInt();
    	int key[] =new int[n];
    	int chst[]=new int[m];
    	int z[]=new int[m];
    	for(int i=0;i<n;i++)
    	{
    		key[i]=sc.nextInt();
    	}
    	for(int i=0;i<m;i++)
    	{
    		chst[i]=sc.nextInt();
    	}
    	for(int i=0;i<m;i++)
    	{
    		z[i]=sc.nextInt();
    	}
    	int max[]=new int[n];
    	
    	for(int i=0;i<n;i++ )
    	{
    		int sum=0;
    		for(int j=0;j<m;j++)
    		{
    			if(z[j]!=-1&&!coprime(chst[j],key[i]))
    			{
    				sum=sum+z[j];
    				z[j]=-1;
    			}
    		}
    		max[i]=sum;
    	}
    	for(int i=0;i<max.length;i++)
    	{
    		System.out.print(max[i]+" ");
    	}
    	int tmax=0;
    	int maxn=0;
    	for(int i=0;i<max.length;i++)
    	{
    		tmax=0;
    		int j=i;
    		int g=k;
    		while(g!=0)
    		{
    			if(j<max.length)
    			tmax+=max[j];
    			g--;
    			j++;
    		}
    		if(maxn<tmax)
    		{
    			maxn=tmax;
    		}
    	}
    	System.out.println(maxn);
    	t--;
      }
   }
	static int __gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0 || b == 0) 
            return 0; 
          
        // base case 
        if (a == b) 
            return a; 
          
        // a is greater 
        if (a > b) 
            return __gcd(a-b, b); 
                  
        return __gcd(a, b-a); 
    } 
      
    // function to check and print if  
    // two numbers are co-prime or not  
    static boolean coprime(int a, int b) { 
          
        if ( __gcd(a, b) == 1) 
            return true ;
        else
            return false;      
    } 
      

}
