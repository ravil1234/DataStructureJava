package recursionques;
import java.util.*;
public class power {

	public static void main(String[] args) {
		int n,x;
		Scanner sc=new 	Scanner (System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		System.out.println("enter power");
		x=sc.nextInt();
		System.out.println(pow(n,x));
	}
public static int pow(int n,int x)
{
	if(x==0)
		return 1;
	return (n*pow(n,x-1));
}

}
