package pritampurabatch;
import java.util.*;
public class inverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int i=1;
		while(n!=0)
		{
			int rem=n%10;
			s=s+i*((int)Math.pow(10, rem));
			n=n/10;
			i++;
		}
		System.out.println(s/10);
	}

}
