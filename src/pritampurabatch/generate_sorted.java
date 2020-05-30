package pritampurabatch;
import java.util.*;
public class generate_sorted {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			b[j]=sc.nextInt();
		}
		sorted(a,b,0,0,"",true,Integer.MIN_VALUE);
	}
public static void sorted(int a[],int b[],int i,int j,String res,boolean check,int last)
{
	
	if(check&&res.length()!=0)
    {
    	System.out.println(res);
    }
    if(check)
    {
    	for(int k=i;k<a.length;k++)
    	{
    		if(a[k]>last)
    		{
    			sorted(a,b,k+1,j,res+a[k]+" ",!check,a[k]);
    		}
    	}
    }
    else
    {
    	for(int k=j;k<b.length;k++)
    	{
    		if(b[k]>last)
    		{
    			sorted(a,b,i,k+1,res+b[k]+" ",!check,b[k]);
    		}
    	}
    }
  }
}
