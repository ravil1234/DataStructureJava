package DAILYCODE;
import java.util.*;
public class patternmountain {
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=(2*n-1)-2;
		int j,i;
           for(i=1;i<=n;i++)
           {
        	   for(j=1;j<=i;j++)
        	   {
        		   System.out.print(j+"	");
        	   }
        	   for(int k=1;k<=s;k++)
        	   {
        		   System.out.print(" 	");
        	   }
        	   for(int k=j-1;k>=1;k--)
        	   {
        		   if(k!=n)
        		   {
        		  System.out.print(k+"	");
        	       }
        	   }
        	   System.out.println();
        	   s=s-2;
           }
	}

}
