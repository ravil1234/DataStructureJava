package aug_challenge;
import java.util.*;
public class alex_football {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			int min=-1;
			for(int i=0;i<n;i++)
			{
				int sum=(20*a[i])-(10*b[i]);
				if(sum<0)
				    sum=0;
				if(min<sum)
				{
					min=sum;
				}
			}
			System.out.println(min);
			t--;
		}

	}

}
