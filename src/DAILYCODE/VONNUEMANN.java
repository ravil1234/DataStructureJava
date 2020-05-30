package DAILYCODE;
import java.util.*;
public class VONNUEMANN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			decimal(n);
			t--;
		}

	}
public static void decimal(int n)
{
	int sum=0;
	int i=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+(int)(Math.pow(2, i))*r;
		n=n/10;
		i++;
	}
	System.out.println(sum);
  }
}
