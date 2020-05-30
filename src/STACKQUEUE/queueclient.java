package STACKQUEUE;
import java.util.Scanner;
public class queueclient {
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter capacity");
		int n=sc.nextInt();
		queuearr q=new queuearr(n);
		for(int i=1;i<=5;i++)
		{
		 int a=sc.nextInt();
		 q.push(a);
		 q.display();
		}
		q.push(70);
		q.pop();
		q.display();
	}

}
