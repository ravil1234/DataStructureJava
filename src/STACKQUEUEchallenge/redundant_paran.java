package STACKQUEUEchallenge;
import java.util.*;
public class redundant_paran {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> stk=new Stack<>();
	   if(redundant(s,stk))
	   {
		   System.out.println("Duplicate");
	   }
	   else
	   {
		   System.out.println("Not Duplicates");
	   }

	}
public static boolean redundant(String s,Stack<Character> stk)
{
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch==')')
		{
			char top=stk.peek();
			stk.pop();
			int inel=0;
			while(top!='(')
			{
				inel++;
				top=stk.peek();
				stk.pop();
			}
			if(inel<1)
			{
				return true;
			}
		}
		else
		{
			stk.push(ch);
		}
	}
	return false;
  }
}
