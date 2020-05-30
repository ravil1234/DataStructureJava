package aug_challenge;
import java.util.*;
import java.util.Scanner;
public class theatre2 
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
		 long max=0;
		 int res[]=new int[4];
		 for(int i=0;i<4;i++)
		 {
			 res[0]=a[0][i];
		 for(int j=0;j<4;j++)
		 	{
		 		if(j!=i)
		 		{
		 		res[1]=a[1][j];
		 	   for(int k=0;k<4;k++)
		 	   {
		 		   if(k!=j&&k!=i)
		 		   {
		 		   res[2]=a[2][k];
		 		   for(int l=0;l<4;l++)
		 		   {
		 			   if(l!=k)
		 			   {
		 			   res[3]=a[3][l];
		 			   int nar[]=new int[4];
		 			   for(int z=0;z<nar.length;z++)
		 			   {
		 				   nar[z]=res[z];
		 			   }
		 			    Arrays.sort(res);
		 			    int cost[]= {25,50,75,100};
		 			    long msum=0;
		 			    for(int z=0;z<cost.length;z++)
		 			    {
		 			    	msum+=res[z]*cost[z];
		 			    }
		 			    if(msum>max)
		 			    {
		 			    	for(int z=0;z<res.length;z++)
		 			    	{
		 			    		System.out.print(nar[z]+" ");
		 			    	}
		 			    	System.out.println();
		 			    	max=msum;
		 			    }
		 			   }
		 		   }
		 		  }
		 	   }
		 		}
		 	   }
		 }
		 int count=0;
		 int c=0;
		 for(int i=0;i<4;i++)
		 {
			 for(int j=0;j<4;j++)
			 {
				 if(a[i][j]!=0)
				 {
					 count=1;
					 break;
				 }
			 }
			 if(count!=1)
			 {
				 c++;
			 }
		 }
		 max-=c*100;
		 System.out.println(max);
		 sum+=max;
		 t--;
		}
		System.out.println(sum);
	}
}
