package pritampurabatch;
import java.util.*;
public class playing_card {
	public static void main(String[] args) {
		
		Scanner sc=new 	Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		Stack<Integer> a=new Stack<>();
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			a.push(x);
		}
		Stack<Integer> b=new Stack<>();
		ArrayList<Integer> res=seive(100000);
		int i=1;
		while(i<=q)
		{
			Stack<Integer> aq=new Stack<>();
			while(!a.isEmpty())
			{
				int rv=a.pop();
				if(rv%res.get(i-1)==0)
				{
					b.push(rv);
				}
				else
					aq.push(rv);
			}
			while(!b.isEmpty())
			{
				System.out.println(b.pop());
			}
			a=aq;
			i++;
		}
		while(!a.isEmpty())
		{
			System.out.println(a.pop());
		}
	}
public static ArrayList<Integer> seive(int n)
{
	ArrayList<Integer> res=new ArrayList<>();
	
	boolean b[]=new boolean[n+1];
	Arrays.fill(b, true);
	b[0]=b[1]=false;
	for(int i=2;i*i<=n;i++)
	{
		if(b[i])
		{
			for(int j=i*2;j<=n;j+=i)
			{
			     b[j]=false;	
			}
		}
	}
    for(int i=2;i<=n;i++)
    {
    	if(b[i])
    	{
    		res.add(i);
    	}
    }
    return res;
  }
}
