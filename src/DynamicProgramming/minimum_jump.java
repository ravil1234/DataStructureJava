package DynamicProgramming;
import java.util.*;
public class minimum_jump {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int j[]=new int[n];
			j[n-1]=0;
			for(int i=n-2;i>=0;i--)
			{
				if(a[i]==0)
				{
					j[i]=Integer.MAX_VALUE;
				}
				else if(a[i]>=n-i-1)
				{
					j[i]=1;
				}
				else
				{
					int min=Integer.MAX_VALUE;
					for(int k=i+1;k<n&&k<=(a[i]+i);k++)
					{
						if(min>j[k])
						{
							min=j[k];
						}
					}
					if(min!=Integer.MAX_VALUE)
					{
						j[i]=min+1;
					}
					else
						j[i]=min;
				}
			}
			System.out.println(j[0]);
		t--;	
		}
	}

}
