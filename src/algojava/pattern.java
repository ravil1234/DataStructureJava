package algojava;
import java.util.*;
public class pattern {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=2*n-1;
        int i,j;
        for(i=n;i>=0;i--)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            for(int k=0;k<sp;k++)
            {
                System.out.print("  ");
            }
             for(j=i;j<=n;j++)
            {
            	 if(j!=0)		 
                System.out.print(j+" ");
            }
             System.out.println();
             sp=sp-2;  
        }
        sp=2;
        for(i=1;i<=n;i++)
        {
        	for(j=n;j>=i;j--)
        	{
        		System.out.print(j+" ");
        	}
        	for(int k=1;k<sp;k++)
        	{
        		System.out.print("  ");
        	}
        	for(j=i;j<=n;j++)
        	{
        		System.out.print(j+" ");
        	}
        	sp=sp+2;
        	System.out.println();
        }

    }
}
