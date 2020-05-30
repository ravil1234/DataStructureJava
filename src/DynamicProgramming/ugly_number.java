package DynamicProgramming;
import java.util.*;
public class ugly_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int i2=0,i3=0,i5=0;
			int f2=2;
			int f3=3;
			int f5=5;
			int dp[]=new int[n];
			dp[0]=1;
			for(int i=1;i<n;i++)
			{
			   int m=Math.min(f2, Math.min(f3, f5));
			   dp[i]=m;
			   if(m==f2)
			   {
				   i2++;
				f2=dp[i2]*2;
			   }
			   if(m==f3)
			   {
				   i3++;
				   f3=dp[i3]*3;
			   }
			   if(m==f5)
			   {
				   i5++;
				   f5=dp[i5]*5;
			   }  
			}
		   System.out.println(dp[n-1]+" ");
		 t--;
		}
	}
}
