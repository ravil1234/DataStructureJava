package pritampurabatch;
import java.util.Scanner;
public class gcd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i=1;
		if(n<m)
			i=n;
		else
			i=m;
		while(true)
		{
			if(n%i==0&&m%i==0)
			{
				System.out.println(i);
				break;
			}
			i--;
		}

	}

}
