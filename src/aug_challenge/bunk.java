package aug_challenge;
import java.util.*;
public class bunk {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			long n=sc.nextLong();
			float a=0;
		   if(n>7)
		    a=n%7;
		   else
			 a=n;
			float p=0;
			if(a>=3)
			{
				p=1;
				System.out.format("%.6f",p);
			}
			else
			{
				p=1-a/4;
				System.out.format("%.6f",p);
				
			}
			t--;
		}

	}

}
