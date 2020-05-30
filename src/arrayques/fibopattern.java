package arrayques;
import java.util.*;
public class fibopattern {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=0, b=1;
	int sum=0;
	for(int i=0;i<n;i++)
	{
		if(i==0)
		{
			a=b;
			b=sum;
			System.out.print(sum+"   ");	
		}
		else
		{
			for(int j=0;j<=i;j++)
			{
				sum=a+b;
				a=b;
				b=sum;
				System.out.print(sum+"   ");
			}
		}
			System.out.println();
		}
	}

}
