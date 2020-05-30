package recursionques;
import java.util.*;
public class permutation{
    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        System.out.println(permu(str));
    }
    public static ArrayList<String> permu(String str)
    {
    	if(str.length()==0)
    	{
    		ArrayList<String> ss=new ArrayList<>();
    		ss.add(" ");
    		return ss ;
    	}
    	char cc=str.charAt(0);
    	String str1=str.substring(1);
    	ArrayList<String> res=new ArrayList<>();
    	ArrayList<String> res1=permu(str1);
    	for(int i=0;i<res1.size();i++)
    	{    		
        	String str2=res1.get(i);
    		for(int j=0;j<str2.length();j++)
    		{
    			String str3=str2.substring(0,j)+cc+str2.substring(j);
    		     res.add(str3);
    		}
    	}
    	return res;
    }
}