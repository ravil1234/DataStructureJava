package recursionques;
import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nth location");
		n=sc.nextInt();
		System.out.println(fibo(n));
	}
public static int fibo(int n)
{
	if(n==1)
	{
		return 1;
	}
	if(n==0)
	{
	return 0;
	}
	int first=fibo(n-1);
	int second=fibo(n-2);
	int fn=first+second;
	return fn;
}
}
