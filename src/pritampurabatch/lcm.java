package pritampurabatch;
import java.util.*;
public class lcm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i=1;
		if(n<m)
			i=m;
		else
			i=n;
		while(true)
		{
			if(i%n==0&&i%m==0)
			{
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
