package DAILYCODE;
import java.util.*;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
public class MELON_emp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int m=sc.nextInt();
		char ch1=str.charAt(0);
		String s1="";	
	     s1=s1+ch1;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=ch1)
			{
				s1=s1+ch;
				ch1=ch;
			}
		}
		while(m!=0)
		{
			String s=sc.next();
	        Pattern pattern = Pattern.compile(s); 
	        Matcher m1 = pattern.matcher(str); 
	       if (m1.find()) 
	       {
	            System.out.println("Possible " + m1.start() + 
	                               " "+ (m1.end()-1)); 
	       }
			else
			{
				System.out.println("Not Possible");
			}
			m--;
		}
	}
}

/*
aaabbbccddee
3
aaabb
Possible 0 4
bbbcc
Possible 3 7

ccddee
Possible 6 11
 */