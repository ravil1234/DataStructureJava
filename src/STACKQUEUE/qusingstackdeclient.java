package STACKQUEUE;
import java.util.*;
public class qusingstackdeclient {
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		QUSTACKDEQE qst=new QUSTACKDEQE();
		
		for(int i=1;i<=5;i++)
		{
			int a=sc.nextInt();
			qst.push(a);
		}
		qst.display();
		System.out.println(qst.pop());
		qst.display();

	}

}
