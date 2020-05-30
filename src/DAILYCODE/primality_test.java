package DAILYCODE;
import java.util.*;
public class primality_test {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			long n=sc.nextLong();
			if(isPrime(n,4))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			t--;
		}
	}
	
	static long power(long a,long n, long p) 
    { 
        long res = 1; 
        a = a % p;  
        while (n > 0) 
        { 
            if ((n & 1) == 1) 
                res = (res * a) % p;  
            n = n >> 1; // n = n/2 
            a = (a * a) % p; 
        } 
        return res; 
    } 
	static boolean isPrime(long n,long k) 
    { 
    // Corner cases 
    if (n <= 1 || n == 4)
    	return false; 
    if (n <= 3) 
    	return true; 
    while(k>0)
    {
        int a = 2 + (int)(Math.random() % (n - 4));  
        if (power(a, n - 1, n) != 1) 
            return false; 
        k--;
    }
        return true; 
    } 	
}	
/*
public static boolean[] seive()
{
   boolean p[]=new boolean[10000009];
   Arrays.fill(p,true); 
   for(int i=2;i*i<10000009;i++)
   {
	   if(p[i]==true)
	   {
		   for(int j=i*2;j<10000009;j+=i)
		   {
			   p[j]=false;
		   }
	   }
   }
   return p;
}
*/
