package recursionques;
import java.util.*;
public class pdiskip {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter range");
		n=sc.nextInt();
		pdis(n);
	}
	public static void pdis(int n)
	{
		if(n==0)
			return;
		if(n%2!=0)
		{
			System.out.println(n);
			
		}
		pdis(n-1);
		if(n%2==0)
		{
			
			System.out.println(n);
		}
		
	}

}
