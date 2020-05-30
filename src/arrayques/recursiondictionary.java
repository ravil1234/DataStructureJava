package arrayques;
import java.util.*;
public class recursiondictionary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<String> res=dictionary(str);
		System.out.println(res);
		display(res,str);

	}
	public static ArrayList<String> dictionary(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> b=new ArrayList<>();
			b.add(" ");
			return b; 
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> res=new ArrayList<>();
		ArrayList<String> res1=dictionary(ros);
		for(int i=0;i<res1.size();i++)
    	{
        	String str2=res1.get(i);
    		for(int j=0;j<str2.length();j++)
    		{
    			String str3=str2.substring(0,j)+ch+str2.substring(j);
    		     res.add(str3);
   
    		}
    		
    	}
		return res;
	}
	public static void display(ArrayList<String> res,String sc)
	{
		Collections.sort(res);
		for(int i=0;i<res.size();i++)
		{
			String str3=res.get(i);
			for(int l=0;l<sc.length();l++)
			{
				char ch1=str3.charAt(l);
				char ch2=sc.charAt(l);
				if(ch1<ch2)
				{
					System.out.println(str3);
					break;
				}
				if(ch1==ch2)
				{
					continue;
				}
				else
				{
					break;
				}
				
			}
			
		}
	}

}
