package arrayques;
import java.util.*;
public class pallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		if(s.equals(str)==true)
		{
			System.out.print("true");
		}
		else
			System.out.print("false");

	}

}
