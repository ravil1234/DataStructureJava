package STACKQUEUEchallenge;
import java.util.*;
public class playingcard {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		Stack<Integer> a=new Stack<>();
		Stack<Integer> b=new Stack<>();
		for(int i=0;i<n;i++)
		{
			a.push(sc.nextInt());
		}
		Stack<Integer> c=new Stack<>();
		card(q,a,b,c);
	}
	public static void card(int q,Stack<Integer> a,Stack<Integer> b,Stack<Integer> c)
	{
		if(q==0)
		{
			while(!a.isEmpty())
			{
				System.out.println(a.pop());
			}
			return ;
		}
			while(!a.isEmpty())
			{
			int pr=(prime(q));
			int s=a.peek();
			if(s%pr==0)
				b.push(a.pop());
			else
				c.push(a.pop());
		    }
			while(!c.isEmpty())
			{
				a.push(c.pop());
			}
			Stack<Integer> res=new Stack<>();
			reverse(a,res,0);
			while(!b.isEmpty())
		       {
		    	   System.out.println(b.pop());
		       }
				card(q-1,a,b,c);
	}
	public static  void reverse(Stack<Integer> s,Stack<Integer> res,int index)
	{
		if(s.isEmpty())
		{
			return;
		}
		int item=s.pop();
		reverse(s,res,index+1);
		res.push(item);
		if(index==0)
		{
		while(!res.isEmpty())
		{
			s.push(res.pop());
		}
	}
			
	}
	public static int prime(int q)
	{
		int i=0;
		int c=1;
		while(true)
		{	
			int count=0;
			for(int j=1;j<=c/2;j++)
			{
				if(c%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				i++;
				if(i==q)
				{
					break;
				}
			}
           c++;
		}
		return c;
	}

}
