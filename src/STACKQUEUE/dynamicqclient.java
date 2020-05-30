package STACKQUEUE;
import java.util.*;
public class dynamicqclient {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		queuearr q=new dynamicq(5);
		for(int i=1;i<=5;i++)
		{
		 int a=sc.nextInt();
		 q.push(a);
		 q.display();
		}
		q.push(70);
		q.push(90);
		q.push(40);
		q.display();
		while(!q.isempty())
		{
			q.pop();
			q.display();
		}
		q.push(90);
		q.push(70);
		q.display();
	
	}

}
