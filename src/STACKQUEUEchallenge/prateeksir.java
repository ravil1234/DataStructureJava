package STACKQUEUEchallenge;
import java.util.*;
public class prateeksir {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> s=new Stack<>();
		for(int i=1;i<=n;i++)
		{
			int a=sc.nextInt();
			if(a==1)
			{
				if(s.isEmpty())
				{
					System.out.println("No Code");
				}
				else
				{
				System.out.println(s.peek());
				s.pop();
				}
			}
			if(a==2)
			{
				int b=sc.nextInt();
				s.push(b);
			}
		}
         
	}

}
