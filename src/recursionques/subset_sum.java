package recursionques;
import java.util.*;
public class subset_sum {
	static  int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
      int s=sc.nextInt(); 
      subset(a,0,s,0,"");
      System.out.println();
      System.out.println(count);
	}
public static void subset(int a[],int i,int s,int sum,String sub)
{
	if(a.length==i)
	{
		if(s==sum)
		{
			System.out.print(sub+" ");
			count++;
		}
		return;
	}
	
	subset(a,i+1,s,sum+a[i],sub+a[i]+" ");
	subset(a,i+1,s,sum,sub);
}
}
