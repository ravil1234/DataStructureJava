package DAILYCODE;
import java.util.*;
public class PHOTOGRAPH {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		long lcm=2;
		while(true)
		{
			int count=0;
			for(int i=0;i<n;i++)
			{
				if(lcm%a[i]!=0)
				{
					break;
				}
				else
				{
					count++;
				}
				
			}
			if(count==n)
			{
				lcm=lcm%((10^9+7));
				System.out.print(lcm);
				break;
			}
			lcm++;
		}

	}

}
