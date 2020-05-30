package codsule;
import java.util.*;
public class soldier {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t!=0)
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		long sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=sum+Math.abs(a[i]-a[j])*(Math.max(b[i], b[j]));
			}
		}
		sum=sum%((long)Math.pow(10, 9)+7);
		System.out.println(sum);
		t--;
	  }
	}

}
