package recursionques;
import java.util.*;
public class factorial {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a n0.");
		n=sc.nextInt();
		System.out.println(fact(n));
	}
public static int fact(int n)
{
	if(n==1)
		return 1;
	
	return (n*fact(n-1));
}

}
