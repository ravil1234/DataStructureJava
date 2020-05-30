package aug_PRACTICE;
import java.util.*;
public class garima {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int key=sc.nextInt();
		key=key%n;
		int m=n;
		int k=0;
		while(n!=0)
		{
			k++;
		    n=n/10;
		}
		key=key%k;
		System.out.println(key);
		if(key==0)
		{
			System.out.print(m);
		}
		else
		{
		if(key>0)
		{
			System.out.print(m%((int)Math.pow(10, key)));
			m=m/((int)Math.pow(10,(key)));
			System.out.print(m);
		}
		else
		{
			key=Math.abs(key);
			System.out.print(m%((int)Math.pow(10, k-key)));
			m=m/((int)Math.pow(10,k-key));
			System.out.print(m);	
		}
		}
	}

}
