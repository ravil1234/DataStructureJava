package arrayques;
import java.util.*;
public class sumtriplet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[3];
		long sum;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
	       long m=sc.nextLong();
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					sum=a[i]+a[j]+a[k];
					if(sum==m)
					{
						b[0]=a[i];
						b[1]=a[j];
						b[2]=a[k];
						System.out.println(b[0]+", "+b[1]+" and "+b[2]);
					}
					
				}
			}
		}
	}
	}
