package aug_challenge;
import java.util.*;
public class theatre 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	      long sum=0;
		while(t!=0)
		{
		 int a[][]=new int[4][4];
		 int n=sc.nextInt();
		 while(n!=0)
		 {
			 char ch=sc.next().charAt(0);
			 int v=sc.nextInt();
			 int l=ch-65;
			 a[l][(v/3)-1]+=1;
			 n--;
		 }
		 int res[]=new int[4];
		 int k=0;
		 int c=0;
		 boolean visit[]=new boolean[4];
		 for(int i=0;i<4;i++)
		 {
		  int max1=0;
		  int count=0;
		  int v=i;
		  int c3=0;
		 for(int j=0;j<4;j++)
		  {
			 if(a[i][j]==0)
				 count++;
			 if(a[j][i]==0)
				 c3++;
		  if(a[j][i]>max1&&visit[j]==false)
		  {
			  int c2=0;
			  for(int m=0;m<4;m++)
			  {
				if(m!=i&&m!=j)
				{
					if(a[m][i]>a[j][i])
					{
						max1=a[j][i];
						c2=1;
						break;
					}
					if(a[j][m]>a[j][i])
					{
						c2=1;
						break;
					}
				}
			  }
			  if(c2!=1)
			  {
			  max1=a[j][i];
			  v=j;
			  }
		  }
		  }
		 res[k]=max1;
		 if(c3!=4)
		 visit[v]=true;
		    k++;
		    if(count==4)
		    	c++;
		 }
		 Arrays.sort(res);
		 long profit=0;
		
		 System.out.println();
		 int cost[]= {25,50,75,100};
		 for(int i=0;i<4;i++)
			 profit+=res[i]*cost[i];
		 profit-=c*100;
		 System.out.println(profit);
		 sum+=profit;
		 t--;
		}
		System.out.println(sum);
	}
}

