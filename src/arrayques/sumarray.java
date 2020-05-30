package arrayques;
import java.util.*;
public class sumarray {
	public static void main(String[] args) {
		int n,max,m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		n=sc.nextInt();
		int arr[]=new int[n];
		int b[]=new int[100];
		int c[]=new int[100];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{	int sum=0,k=0;
			for(int j=i;j<n;j++)
			{
			sum+=arr[j];
			b[k]=sum;
			k++;
			}
			max=b[0];
			for(int l=1;l<k;l++)
			{
				if(max<=b[k])
				{
					max=b[k];
				}
			}
			c[m]=max;
			m++;
			
		}
		
		max=c[0];
		for(int l=1;l<m;l++)
		{
			if(max<=b[l])
			{
				max=b[l];
			}
		}
		System.out.println(max);
	}

}
