package STACKQUEUEchallenge;
import java.util.*;
public class balancedparant {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		Stack<Character> stack=new Stack<>(); 
		System.out.println(isBalanced(str, stack));
	}
public static boolean isBalanced(String str, Stack<Character> stack)
{
	int c=0;
	for(int i=0;i<str.length();i++)
	{
		 c=0;
	char ch=str.charAt(i);
	if(ch=='('||ch=='{'||ch=='[')
		stack.push(ch);
	else
	{
		if(stack.isEmpty())
		{
			c=1;
			break;
		}
		char ch1=stack.pop();
		if(ch==')'&&ch1=='(')
		{
			
		}
		else if(ch=='}'&&ch1=='{')
		{
			
		}
		else if(ch==']'&&ch1=='[')
		{
			
		}
		else
			break;		
	}
   }
	if(stack.isEmpty()&&c!=1)
	return true;
	else
	return false;
  }	
}