package aug_PRACTICE;
import java.util.*;
public class aggressivecows {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int max=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(max<a[i])
				max=a[i];
		}
		int k=max/c;
		System.out.println(k);

	}

}
