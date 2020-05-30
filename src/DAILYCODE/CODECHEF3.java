package DAILYCODE;
import java.util.*;
public class CODECHEF3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=0,p=0;
           for(int i=0;i<=n/2;i++)
           {
        	   p=p+a[i];
           }
           for(int i=(n/2)+1;i<n;i++)
           {
        	   k=k+a[i];
           }
           System.out.println(Math.abs(k-p));
	}

}
