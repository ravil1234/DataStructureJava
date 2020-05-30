package arrayques;
import java.util.*;
public class patternno_star {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print(j+" ");
					
				}
				else
				{
					System.out.print("* ");
				}
				
			}
			if(i!=n)
			{
				for(int k=1;k<sp;k++)
				{
					System.out.print("* ");
				}
				sp=sp+1;
			}
			
			System.out.println();
		}
	}

}
