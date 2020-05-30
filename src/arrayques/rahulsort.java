package arrayques;
import java.util.*;
public class rahulsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(m==a[i])
			{
				c=1;
				System.out.print(i);
				break;
			}
		}
		if(c==0)
		{
			System.out.print(-1);
		}

	}

}
