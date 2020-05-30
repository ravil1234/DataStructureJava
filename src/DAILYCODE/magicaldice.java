package DAILYCODE;
import java.util.*;
public class magicaldice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			double sum=1.00;
			int m=n;
			for(int i=m-1;i>0;i--)
			{
				double p=(double)n/i;
				sum=sum+p;
			}
			System.out.format("%.2f",sum);
			System.out.println();
			t--;
		}

	}

}
