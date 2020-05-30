package DAILYCODE;
import java.math.BigInteger;
import java.util.*;
public class fastfibo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			System.out.println(fib(n));
			t--;
		}
	}
	static BigInteger fib(int n) 
    { 
        BigInteger a = BigInteger.valueOf(1); 
        BigInteger b = BigInteger.valueOf(1); 
        BigInteger c = BigInteger.valueOf(2); 
        for (int j=2 ; j<=n ; j++) 
        { 
            c =  a.add(b); 
            a = b; 
            b = c; 
        } 
  
        return (a); 
    } 
}
/*
		while(t!=0)
		{
			long sum=0;
		   int n=sc.nextInt();
		    long first=1;
		    long second=1;
		    for(int i=3;i<=n;i++)
		    {
		    	sum=first+second;
		    	first=second;
		    	second=sum;
		    }
		    sum=(long)(sum%(Math.pow(10, 9)+7));
		     System.out.println(sum);
		    }
		 t-
		 */



































