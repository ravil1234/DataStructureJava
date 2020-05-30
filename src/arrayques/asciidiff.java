package arrayques;
import java.util.*;
public class asciidiff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i;
		String s="";
		for( i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			s=s+ch;
			if(i<str.length()-1)
			{
				char ch1=str.charAt(i+1);
				int l=ch1-ch;
				s=s+l;
			}
		}
		System.out.println(s);

	}

}
