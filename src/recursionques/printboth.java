package recursionques;
import java.util.*;
public class printboth {

	public static void main(String[] args) {	
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter range");
		n=sc.nextInt();
		pdi(n);
		
	}
	public static void pdi(int n)
	{
		if(n==0)
		{
			return;
		}
	System.out.println(n);
	pdi(n-1);
	System.out.println(n);
	}

}
