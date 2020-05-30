package algojava;
import java.util.*;
public class ALI {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[k];
		int j=0;
		int l=1;
		for(int i=0;i<k;i++)
		{
			if((j+i+1)>=n)
			{
				a[i]+=n;
				break;
			}
			a[i]+=j+i+1;
			n=n-(j+i+1);
			if(i==k-1)
			{
				i=-1;
				j=l*k;
				l++;
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(a[i]);
		}
	}

}
