package arrayques;
import java.util.*;
public class arraytargetpair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			    sum=a[i]+a[j];
			    if(sum==m)
			    {
			    	if(a[i]>a[j])
			    	System.out.println(a[j]+" and "+a[i]);
			    	else
			    		System.out.println(a[i]+" and "+a[j]);
			    }
			}
		}

	}

}
