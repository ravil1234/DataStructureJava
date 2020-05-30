package STACKQUEUE;
import java.util.*;
public class stackuqpopclient {
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		stackusingqpop stq=new stackusingqpop();
	    int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			stq.push(a);
		}
		stq.display();
		System.out.println(stq.pop());
		stq.display();
		System.out.println(stq.top());

	}

}
