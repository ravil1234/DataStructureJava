package STACKQUEUE;
import java.util.*;
public class stackuqpushclient {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		stackuqpush stk=new stackuqpush();
		for(int i=1;i<=5;i++)
		{
			int a=sc.nextInt();
			stk.push(a);
		}
		System.out.println(stk.pop());
        System.out.println(stk.peek());
		stk.display();
         System.out.println(stk.pop());
         System.out.println(stk.peek());
         stk.display();
         System.out.println(stk.pop());
         System.out.println(stk.peek());
         stk.push(10);
         stk.display();
	}

}
