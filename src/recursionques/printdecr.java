package recursionques;
import java.util.*;
public class printdecr {
	public static void main (String args[])
	{
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter range");
		n=sc.nextInt();
		pd(n);
	}
	public static void pd(int n)
	{
		if(n==0)
		{
			return;
		}
	System.out.println(n);
	pd(n-1);
	}
}

