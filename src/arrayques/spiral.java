package arrayques;
import java.util.*;
public class spiral {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int row=m;
		int colm=n;
		int count=0;
           for(int i=0;i<colm;i++)
           {
        	   for(int j=i;j<row;j++)
        	   {
        		   count++;
        		   System.out.print(a[j][i]+", ");
        	   }
        	   if(count==(m*n))
        		   break;
        	   for(int k=i+1;k<colm;k++)
        	   {
        		   count++;
        		   System.out.print(a[row-1][k]+", ");
        	   }
        	   if(count==(m*n))
        		   break;
        	   for(int l=row-2;l>=i;l--)
        	   {
        		   count++;
        		   System.out.print(a[l][colm-1]+", ");
        	   }
        	   if(count==(m*n))
        		   break;
        	   for(int l=colm-2;l>i;l--)
        	   {
        		   count++;
        		   System.out.print(a[m-row][l]+", ");
        	   }
        	   if(count==(m*n))
        		   break;
        	   row--;
        	   colm--;
           }
           System.out.println("END");
	}

}
