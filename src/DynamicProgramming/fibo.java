package DynamicProgramming;
import java.util.*;
public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int strg[]=new int[n+1];
        //normal fibo;
        long start=System.currentTimeMillis();
       System.out.println(fibnorm(n));
        System.out.println(System.currentTimeMillis()-start);//time taken normal
        // recursive storage approach.
        start=System.currentTimeMillis();
        System.out.println(fibstrg(n,strg));
        System.out.println(System.currentTimeMillis()-start);// dp time taken
        // iterative approach
        System.out.println(fibIt(n));
	}
public static int fibnorm(int n )
{
	if(n==0)
	{
	return 0;
	}
	if(n==1)
	{
		return 1;
	}
	int f1=fibnorm(n-1);
	int f2=fibnorm(n-2);
	int fn=f1+f2;
	return fn;
	
}
public static int fibstrg(int n,int[]strg)
{
	if(n==0)
	{
	return 0;
	}
	if(n==1)
	{
		return 1;
	}
	if(strg[n]!=0)
	{
		return strg[n];
	}
	int f1=fibstrg(n-1,strg);
	int f2=fibstrg(n-2,strg);
	int fn=f1+f2;
	strg[n]=fn;
	return fn;
	
}
public static int fibIt(int n )
{
	int stg[]=new int[n+1];
	stg[0]=0;
	stg[1]=1;
	for(int i=2;i<=n;i++)
	{
		stg[i]=stg[i-1]+stg[i-2];
	}
	return stg[n];
	
}
}
