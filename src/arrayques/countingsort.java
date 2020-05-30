package arrayques;
import java.util.*;
public class countingsort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(max<a[i])
				max=a[i];
		}
		countingsrt(a,max);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
public static int[] countingsrt(int a[],int max)
{
	int b[]=new int[max+1];
	for(int i:a)
	{
		b[i]=b[i]+1;
	}
	int index=0;
	for(int i=0;i<b.length;i++)
	{
		while(b[i]>0)
		{
			a[index]=i;
			index++;
			b[i]--;
		}
	}
	return a;
}
}
