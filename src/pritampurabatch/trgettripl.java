package pritampurabatch;
import java.util.*;
public class trgettripl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		Arrays.sort(a);
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					int sum=a[i]+a[j]+a[k];
					if(sum==m)
					{
						System.out.println(a[i]+" , "+ a[j]+" and "+a[k] );
						break;
					}
				}
			}
			
		}
	}

}
