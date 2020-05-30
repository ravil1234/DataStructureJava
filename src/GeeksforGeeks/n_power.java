package GeeksforGeeks;
import java.util.*;
public class n_power {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		int n=sc.nextInt();
		int x=sc.nextInt();
		
		int p=(int)Math.pow(n,(1/(double)x));
		//System.out.println(p);
		power(n,x,0,1,p+1);
		
		System.out.println(count);
		count=0;
		t--;
	   }
	}
public static void power(int n,int p,int sum,int i,int x)
{
	if(i>x)
		return;
	if(sum>n)
		return;
	if(sum==n)
	{
		count++;
		return;
	}
	   int s=(int)Math.pow(i, p);
		   power(n,p,sum+s,i+1,x);
		   power(n,p,sum,i+1,x);
	   
  }
}
