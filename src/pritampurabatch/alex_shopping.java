package pritampurabatch;
import java.util.*;
public class alex_shopping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int q=sc.nextInt();
		while(q!=0)
		{
			int m=sc.nextInt();
			int k=sc.nextInt();
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(m%a[i]==0)
					count++;
			}
			if(count>=k)
			System.out.println("Yes");
			else
				System.out.println("No");
			q--;
		}

	}

}
