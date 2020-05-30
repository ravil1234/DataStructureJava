package aug_challenge;
import java.util.*;
public class apple_dist {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t!=0)
       {
    	   long n=sc.nextLong();
    	   long k=sc.nextLong();
    	   long p=n/k;
    	   if(p%k==0)
    	   {
    		   System.out.println("NO");
    	   }
    	   else
    	   {
    		   System.out.println("YES");
    	   }
    	   t--;
       }
	}

}
