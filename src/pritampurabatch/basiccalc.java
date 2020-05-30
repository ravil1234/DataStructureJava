package pritampurabatch;
import java.util.*;
public class basiccalc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			char ch=sc.next().charAt(0);
			if(ch=='x'||ch=='X')
			{
				break;
			}
			else if(ch=='+')
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a+b);
			}
			else if(ch=='-')
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a-b);
			}
			else if(ch=='/')
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a/b);
				
			}
			else if(ch=='*')
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a*b);
			}
			else if(ch=='%')
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a%b);
			}
			else
			{
				System.out.println("Invalid operation. Try again.");
			}
		}

	}

}
