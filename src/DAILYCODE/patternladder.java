package DAILYCODE;
import java.util.*;
public class patternladder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum++;
				System.out.print(sum+"	");
			}
			System.out.println();
		}

	}

}
