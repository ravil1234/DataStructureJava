package DAILYCODE;
import java.util.*;
public class balancedparan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='('||ch=='{'||ch=='['||ch==')'||ch==']'||ch=='}')
		{
			s=s+ch;
		}
	}
	
	Stack<Character> stack=new Stack<>(); 
	System.out.println(isBalanced(s, stack));
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
