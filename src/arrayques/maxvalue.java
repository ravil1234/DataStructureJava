package arrayques;
import java.util.*;
public class maxvalue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
		}
		long max=Long.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.print(max);
	}
	

}
