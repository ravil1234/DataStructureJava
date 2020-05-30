package aug_PRACTICE;
import java.util.*;
public class spiralclockwise {
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
	   int count=0;
	   int row=m,colm=n;
	   for(int i=0;i<row;i++)
	   {
		   if(count==(m*n))
				   break;
		   for(int j=i;j<colm;j++)
		   {
			   count++;
			   System.out.print(a[i][j]+", ");
		   }
		   if(count==(m*n))
			   break;
		   for(int k=i+1;k<row;k++)
		   {
			   count++;
			   System.out.print(a[k][colm-1]+", ");
		   }
		   if(count==(m*n))
			   break;
		   for(int l=colm-2;l>=i;l--)
		   {
			   count++;
			   System.out.print(a[row-1][l]+", ");
		   }
		   if(count==(m*n))
			   break;
		   for(int p=row-2;p>i;p--)
		   {
			   count++;
			   System.out.print(a[p][i]+", ");
		   } 
		   if(count==(m*n))
			   break;
		   row--;
		   colm--;
	   }
	   System.out.print("END");
	}

}
