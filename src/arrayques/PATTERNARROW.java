package arrayques;
import java.util.*;
public class PATTERNARROW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		int sp=n-1,sp1=1;
		int k;
		for(int i=1;i<=(n/2)+1;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(k=i;k>0;k--)
			{
				System.out.print(k+" ");
			}
			if(i!=1)
			{
			for(int l=0;l<sp1;l++)
			{
				System.out.print("  ");
			}
			sp1=sp1+2;
		   }
			for(int j=1;j<=i;j++)
			{
				if(i!=1)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
			sp=sp-2;
		}
		sp=sp+4;
		sp1=sp1-4;
	  for(int i=n/2;i>0;i--)
		{
			for(int l=0;l<sp;l++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			if(i!=1)
			{
			for(k=0;k<sp1;k++)
			{
				System.out.print("  ");
			}
			sp1=sp1-2;
		      }
			for(int j=1;j<=i;j++)
			{
				if(i!=1)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
			sp=sp+2;
		}

	}

}
