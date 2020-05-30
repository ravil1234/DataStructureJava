package arrayques;
import java.util.*;
public class manmohanpattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				System.out.print(1);
			}
			else
			{
				for(int j=0;j<=i;j++)
				{
					if(j==0||j==i)
					{
						System.out.print(i);
					}
					else
					{
						System.out.print(0);
					}
				}
				
		}
			System.out.println();
		}
		
	}

}
