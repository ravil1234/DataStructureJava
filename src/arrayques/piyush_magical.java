package arrayques;
import java.util.*;
public class piyush_magical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int d=sc.nextInt();
		 char a[][]=new char[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.next().charAt(0);
			}
		}
		int count=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(d<1)
				{
					count=1;
					break;
				}
				if(a[i][j]=='#')
				{
					break;
				}
				if(a[i][j]=='.')
				{
					d=d-2;
				}
				if(a[i][j]=='*')
				{
					d=d+5;
				}
				if(j!=n-1)
					d=d-1;
			}
			if(count==1)
				break;
		}
		if(count==0)
		{
			System.out.println("Yes");
			System.out.println(d);
		}
		else
		System.out.println("No");
		
	}

}
