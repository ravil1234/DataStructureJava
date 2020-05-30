package STACKQUEUE;
import java.util.*;
public class greatestelement {
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER");
		Stack<Integer> s=new Stack<>();
		int n=sc.nextInt();
		int a[]=new int[n];
		Stack<Integer> r=new Stack<>();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		while(!s.isEmpty()&&a[i]>s.peek())
		{
			int rv=s.pop();
			int index=r.pop();
			b[index]=a[i];
			System.out.println(index+". "+rv+"->"+a[i]);
			
			
		}
		s.push(a[i]);
		r.push(i);
	 }
		
		while(!s.isEmpty())
		{
			int index=r.pop();
			b[index]=-1;
			System.out.println(index+". "+s.pop()+"->"+-1);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	  }
}
