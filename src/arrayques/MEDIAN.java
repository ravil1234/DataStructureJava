package arrayques;
import java.util.*;
public class MEDIAN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int k=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			  for(int i=0;i<n;i++)
			  {
				int c[]=new int[i+1];
				for(int j=0;j<=i;j++)
				{
					c[j]=a[j];
				}
			    Arrays.sort(c);
				if((i+1)%2!=0)
				{
					int s=i/2;
					b[k]=c[s];
					k++;
				}
				else
				{
					int s=(i)/2;
					b[k]=(c[s]+c[s+1])/2;
					k++;
				}
			}
		for(int i=0;i<k;i++)
		{
			System.out.print(b[i]+" ");
		}
			t--;
		}
	}

}
