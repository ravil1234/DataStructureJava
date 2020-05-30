package arrayques;
import java.util.*;
public class patternhourglass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println();
		int sp=0,j;
		for(int i=n;i>=0;i--)
		{
			for(int m=0;m<sp;m++)
			{
				System.out.print("  ");
			}
			for(j=i;j>=0;j--)
			{
				System.out.print(j+" ");
			}
			for(int k=j+2;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			sp++;
		}
		sp=sp-2;
		for(int i=1;i<=n;i++)
		{
			for(int m=0;m<sp;m++)
			{
				System.out.print("  ");
			}
			for(j=i;j>=0;j--)
			{
				System.out.print(j+" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			sp--;
		}
	}

}
