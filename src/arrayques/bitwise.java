package arrayques;
import java.util.*;
public class bitwise {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			System.out.println(binary(n));
			t--;
		}

	}
	public static int binary(int n)
	{
		int s=0;
		while(n!=0)
		{
			int r=n%2;
			if(r==1)
			{
				s++;
			}
			n=n/2;
		}
		return s;
	}
	

}
