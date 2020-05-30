package pritampurabatch;
import java.util.*;
public class isbalanced {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack<Character> stk=new Stack<>();
		System.out.println(isbal(str,stk,0,1));
	}
	
public  static boolean isbal(String str,Stack<Character> stk,int i,int c)
{
	if(i==str.length())
	{
		if(c==1&&stk.isEmpty())
		{
			return true;
		}
		else
		{
			c=0;
			return false;
		}
	}
        char ch=str.charAt(i);
        if(ch=='('||ch=='{'||ch=='[')
    		stk.push(ch);
        else if(ch==')'||ch=='}'||ch==']')
        {
        	if(stk.isEmpty())
        	{
        		c=0;
        		return false;
        	}
        	else
        	{
        	char ch1=stk.pop();
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
        	{
        		c=0;
        		return false;
        	}
           }
        }
       return isbal(str,stk,i+1,c);
}

}
