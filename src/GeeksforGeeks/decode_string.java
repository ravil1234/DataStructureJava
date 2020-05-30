package GeeksforGeeks;
import java.util.*;
public class decode_string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    Stack<String> st=new Stack<>();
	    String dig="";
	    String ans="";
	    for(int i=0;i<s.length();i++)
	    {
	    	char ch=s.charAt(i);
	    	if(ch>=0&&ch<=9)
	    	{
	    		dig=dig+ch;
	    	}
	    	else if(ch=='[')
	    	{
	    		st.push(dig);
	    		dig="";
	    		st.push(Character.toString(ch));
	    	}
	    	else if(ch==']')
	    	{
	    		String s1="";
	    		while(!st.isEmpty()&&st.peek()!="[")
	    		{
	    			s1=st.pop()+s1;
	    		}
	    		if(!st.isEmpty())
	    		st.pop();
	    		if(!st.isEmpty())
	    		{
	    		String k=st.pop();
	    		if(st.isEmpty())
	    		{
	    			String s3="";
	    			int l=Integer.parseInt(k);
	    			while(l-->=1)
	    			{
	    				s3+=ans;
	    				
	    			}
	    			ans+=s3;
	    		}
	    		else
	    		{
	    			String s3="";
	    			int l=Integer.parseInt(k);
	    			while(l-->=0)
	    			{
	    				s3+=s1;
	    				
	    			}
	    			ans+=s3;
	    		}
	    	  }
	    	}
	    	else
	    	{
	    		st.push(Character.toString(ch));
	    	}
	    }
	    System.out.println(ans);
	}
}
