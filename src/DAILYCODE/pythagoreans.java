package DAILYCODE;
import java.util.*;
public class pythagoreans {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t!=0)
		{
			int A=sc.nextInt();
			for(int i=0;i<=(int)Math.sqrt(A);i++)
			{
				for(int j=0;j<=(int)Math.sqrt(A);j++)
				{
					int sum=i*i+(j*j);
					if(sum==A&&i<=j)
					{
						System.out.print("("+i+","+j+") ");
						break;
					}
				}
			}
			System.out.println();
			t--;
		}

	}

}
