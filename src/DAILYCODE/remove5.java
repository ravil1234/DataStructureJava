package DAILYCODE;
import java.util.*;
public class remove5 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	long m=n;
	long i=1;
	if(n==0)
	{
		System.out.print(5);
	}
	else
	{
	while(n!=0)
	{
		long r=n%10;
		if(r==0)
		{
			m=m+(5*i);
		}
		n=n/10;
		i=i*10;
	}
	System.out.println(m);
	}
	}

}
