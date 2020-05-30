package DAILYCODE;
import java.util.*;
public class recursionq {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		rec(n,0);
	}
	public static void rec(int n,int sum)
	{
		if(n<1)
		{
			System.out.print(sum);
			return ;
		}
		sum=sum+n;
		 rec(n-1,sum);
	}

}
