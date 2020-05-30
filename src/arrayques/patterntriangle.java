package arrayques;
import java.util.*;
public class patterntriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,sp=n-1;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int l=1;l<=sp;l++)
			{
				System.out.print(" ");
			  System.out.print("	");
				
			}
			sum=i;
			for(int j=1;j<=i;j++)
			{
               System.out.print(sum+"	");
				sum=i+j;			
			}
			int sum1=sum-2;
			for(int k=1;k<=i-1;k++)
			{
		     System.out.print(sum1+"	");
				sum1=sum1-1;
			}
			sp--;
		System.out.println();	
		}

	}

}
