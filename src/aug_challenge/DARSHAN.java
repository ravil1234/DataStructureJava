package aug_challenge;
import java.util.*;
public class DARSHAN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			long count=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
				if(i%2==0)
				{
				  count=count+a[i];
				}
			}
			long setbit=0;
			int j=0;
			while(true)
			{
			int NUM = Long.bitCount(j);
			setbit=setbit+NUM;
			if(setbit==count)
			{
				break;
			}
			j++;
			}
			System.out.println(j);
			t--;
		}

	}

}
