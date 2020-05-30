package arrayques;
import java.util.*;
public class waveprint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int m=sc.nextInt();
         int n=sc.nextInt();
         int a[][]=new int[m][n];
         for(int i=0;i<m;i++)
         {
        	 for(int j=0;j<n;j++)
        	 {
        		 a[i][j]=sc.nextInt();
        	 }
         }
         for(int i=0;i<n;i++)
         {
        	 if(i%2==0)
        	 {
        	 for(int j=0;j<m;j++)
        	 {
        		 System.out.print(a[j][i]+", ");
        	
        	 }
        	 }
        	 else
        	 {
        	 for(int k=m-1;k>=0;k--)
        	 {
        		 System.out.print(a[k][i]+", ");
        	 }
        	 }
        	 
         }
         System.out.print("END");
	}

}
