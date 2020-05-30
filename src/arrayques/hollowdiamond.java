package arrayques;
import java.util.*;
public class hollowdiamond {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=1;
		for(int i=0;i<=n/2;i++)
		{
			for(int j=i;j<=n/2;j++)
			{
				System.out.print("* 	");
			}
			if(i!=0)
			{ 
			for(int k=0;k<sp;k++)
			{
				System.out.print("  	");
			}
			sp=sp+2;
		   }
			for(int j=i;j<=n/2;j++)
			{
				if(j==0)
				{
					
				}
				else
				System.out.print("* 	");
			}
			System.out.println();
		}
		sp=sp-4;
		for(int i=n/2;i>0;i--)
		{
			for(int j=i;j<=n/2+1;j++)
			{
				System.out.print("* 	");
			}
			if(i!=1)
			{
				for(int k=0;k<sp;k++)
				{
					System.out.print("  	");
				}
				sp=sp-2;
			}
			for(int j=i;j<=n/2+1;j++)
			{
				if(j==1&&i==1)
				{
					
				}
				else
				{
				System.out.print("* 	");
			}
			}
			System.out.println();
		}

	}

}
