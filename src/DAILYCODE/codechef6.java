package DAILYCODE;
import java.util.*;
public class codechef6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          long a[]=new long[(int)n];
          for(int i=0;i<n;i++)
          {
        	  a[i]=sc.nextLong();
          }
          long rev=0;
          Arrays.sort(a);
          for(int  i=n-1;i>=0;i--)
          {
        	  rev=rev+(i*a[i])-(n-1-i)*a[i];
          }
          System.out.print(rev);
	}

}
