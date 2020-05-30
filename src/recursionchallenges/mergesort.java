package recursionchallenges;
import java.util.*;
public class mergesort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
      merge(a,0,n-1);
      for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void merge(int arr[],int s,int e)
	{
		if(s>=e)
		{
			return;
		}
		int mid=(s+e)/2;
		merge(arr,s,mid);
		merge(arr,mid+1,e);
		mergearray(arr,s,e);
		
	}
	public static void mergearray(int arr[],int s,int e)
	{
		int mid=(s+e)/2;
		int i=s;
		int j=mid+1;
		int a[]=new int[arr.length];
		int k=s;
		while(i<=mid&&j<=e)
		{
			if(arr[i]<=arr[j])
			{
				a[k++]=arr[i++];
			}
			else
			{
				a[k++]=arr[j++];
			}
		}
		while(i<=mid)
		{
			a[k]=arr[i];
			i++;
			k++;
		}
		while(j<=e)
		{
			a[k]=arr[j];
			j++;
			k++;
		}
		for(int l=s;l<=e;l++)
		{
			arr[l]=a[l];
		}
}
}
