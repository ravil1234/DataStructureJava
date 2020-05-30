package arrayques;
import java.util.Scanner;
public class sumarray2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
	    int n,k=0;
	    long max;
		n=sc.nextInt();
		long arr[]=new long[n];
		long b[]=new long[100000];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		long sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			if(sum<0)
			{
				sum=0;
			}
			else
			{
				b[k]=sum;
				k++;
			}
		}
		max=b[0];
		for(int l=1;l<k;l++)
		{
			if(max<=b[l])
			{
				max=b[l];
			}
		}
		System.out.println(max);
		t--;
		}
	}

}
