package arrayques;
import java.util.*;
public class primevisit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0,sum=0;
		while(t!=0)
		{
			long a=sc.nextInt();
			long b=sc.nextInt();
		for(long i=a;i<=b;i++)
		{
			if((i%2==0 && i!=2)||(i%3==0 && i!=3))
			{
				
			}
			else
			{	
			count=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==1)
			sum++;	
		   }
		}
		System.out.println(sum);
              t--;
              sum=0;
	   }
	}

}
