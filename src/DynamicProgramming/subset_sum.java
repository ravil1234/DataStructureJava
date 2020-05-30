package DynamicProgramming;
import java.util.*;
public class subset_sum {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int stg[]=new int[s+1];
		sum(a,0,0,s,stg);
		if(count==0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
	}
  public static void sum(int a[],int i,int sum,int s,int stg[])
  {
	  if(i==a.length)
	  {
		  return;
	  }
	  if(sum==s)
	  {
		  count++;
		  return;
	  }
	  if(sum>s)
		return;
	  if(stg[sum]!=0)
		  return;
	  sum(a,i+1,sum+a[i],s,stg);
	  sum(a,i+1,sum,s,stg);
	  if(sum<=s)
	  stg[sum]=sum;
  }
}
