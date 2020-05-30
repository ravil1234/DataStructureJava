package STACKQUEUE;
import java.util.*;
public class qusingstackenclient {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		QUSTACKENQUEE qstc=new QUSTACKENQUEE();
            for(int i=1;i<=5;i++)
            {
            	int a=sc.nextInt();
            	qstc.push(a);
            }
            qstc.display();
            System.out.println(qstc.pop());
            qstc.display();
	}

}
