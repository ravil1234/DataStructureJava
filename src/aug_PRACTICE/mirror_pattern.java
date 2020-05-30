package aug_PRACTICE;
import java.util.*;
public class mirror_pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub#
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		int sp=n/2;
	    for(int i=1;i<=n/2+1;i++)
		{
	    	for(int k=1;k<=sp;k++)
			{
				System.out.print("  ");
			}
		     for(int j=1;j<=s;j++)
		     {
		    	 System.out.print("* ");
		     } 
		     sp--;
		     s=s+2;
		     System.out.println();
		}
		s=s-4;
		sp=sp+2;
		for(int i=n/2+2;i<=n;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=s;j++)
		     {
		    	 System.out.print("* ");
		     } 
			 s=s-2;
			 sp++;
			 System.out.println();
		}
	}

}
