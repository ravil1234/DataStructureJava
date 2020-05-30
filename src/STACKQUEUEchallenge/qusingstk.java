package STACKQUEUEchallenge;
import java.util.*;
public class qusingstk {
	static Stack <Integer> p=new Stack<>();
	static Stack <Integer> s=new Stack<>();
	
	public boolean isempty()
	{
		return p.isEmpty();
	}
	public int size()
	{
		return p.size();
	}
	public static void push1(int item)
	{
		while(p.size()!=0)
		{
			s.push(p.pop());
		}
		p.push(item);
		while(s.size()!=0)
		{
			p.push(s.pop());
		}
	}
	public int pop()
	{
		int rv=p.pop();
		return rv;
	}
	public static void display()
	{
		while(!p.isEmpty())
		{
		System.out.print(p.pop()+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			push1(i);
		}
		display();
		
                	
	}

}
