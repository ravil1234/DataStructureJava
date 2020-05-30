package DynamicProgramming;
import java.util.*;
public class exchanging_coin {
	
	HashMap<Long,Long> h=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println(coin(n));

	}
public static long coin(long n)
{
	if(n==1 ||n==0)
	{
		return n;
	}
	long sum=n/2+n/3+n/4;
	if(sum>n)
	{
		return coin(n/2)+coin(n/3)+coin(n/4);
	}
	else
		return n;
  }

}
