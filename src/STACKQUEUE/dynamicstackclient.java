package STACKQUEUE;
import java.util.*;
public class dynamicstackclient {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		stackarr s=new dynamicstack(5);
		for(int i=1;i<=5;i++)
		{
		 int a=sc.nextInt();
		 s.push(a);
		 s.display();
		}
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.display();
		while(!s.isempty())
		{
			s.pop();
			s.display();
		}
		s.push(0);
		s.display();
		
		
	}

}
