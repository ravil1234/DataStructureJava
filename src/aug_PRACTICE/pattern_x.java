package aug_PRACTICE;
import java.util.*;
public class pattern_x {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int sp=0;
		
		 sp=2*n-3;
		for(int i=1;i<=n;i++)
		{
		   for(int k=1;k<i;k++)
		   {
			   System.out.print(" ");
		   }
		  
		   System.out.print(i);
		   for(int j=1;j<=sp;j++)
		   {
			   System.out.print(" ");
		   }
		   if(i!=n)
		   System.out.print(i);
		   sp=sp-2;
		   System.out.println();
		}
		sp=sp+4;
		for(int i=n-1;i>0;i--)
		{
			for(int k=1;k<i;k++)
			   {
				   System.out.print(" ");
			   }
		 System.out.print(i);
		 for(int j=1;j<=sp;j++)
		 {
			 System.out.print(" ");
		 }
		 sp=sp+2;
		 System.out.print(i);
		 System.out.println();
		}

	}

}
