package arrayques;
import java.util.*;
public class ganeshpat {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int N=sc.nextInt();
			int a=(N/2)+1;
			int c=N-a;
			for(int i=1;i<a;i++)
			{
				System.out.print("*");
				for(int j=1;j<c;j++)
				{
				  System.out.print(" ");	
				}
				if(i==1)
				{
					for(int k=1;k<=a;k++)
					{
						System.out.print("*");
					}
				}
				else
				System.out.print("*");
				System.out.println(" ");
			}
			for(int j=1;j<=N;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			for(int i=a+1;i<=N;i++)
			{
				if(i!=N)
				{
				for(int j=1;j<=c;j++)
				{
				  System.out.print(" ");	
				}
				System.out.print("*");
			    }
				else
				{
					for(int j=1;j<=c;j++)
					{
					  System.out.print("*");	
					}
					System.out.print("*");
				}
				for(int j=1;j<c;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println(" ");
      }
    }
}