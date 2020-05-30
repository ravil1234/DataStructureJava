package DAILYCODE;
import java.util.*;
public class hallows {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int k=sc.nextInt();
			k=Math.abs(k);
			int m=1;
			int i=2;
			int sum=1;
			while(true)
			{
				if(sum==k)
				{
					break;
				}
				if(sum>k)
				{
					i=1;
					sum=sum-i;
					m++;
				}
				if(sum<k)
				{
				   sum=sum+i;
				   m++;
				   i++;
				}
			}
			System.out.println(m);
			t--;
		}

	}

}
