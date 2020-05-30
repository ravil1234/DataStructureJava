package STACKQUEUE;
import java.util.*;
public class stackclient {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter capacity");
		int n=sc.nextInt();
		stackarr s=new stackarr(n);
		for(int i=1;i<=s.data.length;i++)
		{
		 int a=sc.nextInt();
		 s.push(a);
		 s.display();
		}
		for(int i=1;i<=s.data.length;i++)
		{
			
		s.pop();
		s.display();
		}
		
	}

}
