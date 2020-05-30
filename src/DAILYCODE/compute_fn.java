package DAILYCODE;
import java.util.*;
public class compute_fn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t!=0)
	    {
	    long n=sc.nextLong();
	    long sum=(long)Math.pow(-1,n)*(n+1)/2;
	    System.out.println(sum);
	    t--;
	   }
	}

}
