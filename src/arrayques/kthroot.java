package arrayques;
import java.util.*;
public class kthroot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			long n=sc.nextLong();
			int k=sc.nextInt();
			long s=1,e=n;
			long ans=0;
			while(s<=e)
			{
				long mid=(s+e)/2;
				if(power(n,k,mid))
				{
					ans =mid;
					s=mid+1;
				}
				else
					e=mid-1;
			}
			t--;
			System.out.println(ans);
		}
	}
   public static boolean power(long n,long k,long ans)
   {
	   long x=(long)Math.pow(ans, k);
	   if(x<=n)
		   return true;
	   else
		   return false;
   }
}
