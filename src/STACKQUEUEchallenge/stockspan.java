package STACKQUEUEchallenge;
import java.util.*;
public class stockspan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<>();
		Stack<Integer> b=new Stack<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int c=0;
			int x=sc.nextInt();
			s.push(x);
			if(i==0)
			{
				System.out.print(1+" ");
			}
			else
			{
				 c=1;
				int r=s.pop();
				b.push(r);
				while(!s.isEmpty())
				{
					int rv=s.pop();
					b.push(rv);
					if(r>rv)
					{
						c++;
					}
					else
					{
						break;
					}
				}
				while(!b.isEmpty())
				{
					s.push(b.pop());
				}
				System.out.print(c+" ");
			}
		}
System.out.print("END");
	}

}
