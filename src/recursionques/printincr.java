package recursionques;
import java.util.*;
public class printincr {
	public static void main (String args[])
	{
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter range");
		n=sc.nextInt();
		pi(n);
	}
	public static void pi(int n)
	{
		if(n==0)
		{
			return;
		}
		pi(n-1);
	System.out.println(n);
	}
}


