package arrayques;
import java.util.*;
public class setbit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum=0;
			for(int i=a;i<=b;i++)
			{
				sum=sum+Integer.bitCount(i);
			}
			System.out.println(sum);
			t--;
		}
	}

}
