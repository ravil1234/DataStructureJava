package recursionchallenges;
import java.util.*;
public class replacepi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			
			String str=sc.next();
			System.out.println(pie(str,0,""));
			t--;
		}
	}
public static String pie(String str,int i,String s)
{
	char ch1=str.charAt(i);
	if(i==str.length()-1)
	{
		s=s+ch1;
		return s;
	}
	if(i<str.length()-1)
	{
		char ch2=str.charAt(i+1);
		if(ch1=='p'&&ch2=='i')
		{
			s=s+"3.14";
			i=i+1;
			if(i==str.length()-1)
				return s;
		}
		else
			s=s+ch1;
	}
	
	return pie(str,i+1,s);
	
}

}
