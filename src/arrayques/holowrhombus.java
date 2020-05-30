package arrayques;
import java.util.*;
public class holowrhombus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			if(i==0||i==n-1)
			{
				for(int k=0;k<n;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				System.out.print("*");
				for(int j=0;j<n-2;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
			sp--;
		}

	}

}
