package codsule;
import java.util.*;
public class modular_exp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long sum=0;
		if(b%2==0)
		{
			 sum=(long)((Math.pow(a, b/2))* (Math.pow(a, b/2)))%c;
		}
		else
		{
			sum=(long)(a*(Math.pow(a, b-1)))%c;
		}
		System.out.println(sum);
	}

}
