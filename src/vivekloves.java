import java.util.*;
public class vivekloves 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>=1)
		{
		int n=scn.nextInt();
		int[] arr=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=scn.nextInt();
       int c= sa(arr,0,arr.length-1);
       System.out.println(c);
       t--;
	    }
	}
	public static int sa(int[] arr,int si,int ei)
	{
		if(si>=ei)
			return 0;
		
		
		for(int i=si;i<=ei;i++)
		{
			long sum1=sum(arr,si,i);
			long sum2=sum(arr,i+1,ei);
			if(sum1==sum2)
			{
				int fh=sa(arr, si, i);
				int sh=sa(arr, i+1, ei);
				return Math.max(fh,sh)+1;
			}
		}
		return 0;
		
	}
	public static long sum(int[] arr,int si,int ei)
	{
		long s=0;
		for(int i=si;i<=ei;i++)
		{
			s=s+arr[i];
		}
		return s;
	}


}