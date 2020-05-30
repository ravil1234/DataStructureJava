package DAILYCODE;
import java.util.*;
public class count_aaa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String k="aaa";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.length()<k.length())
				break;
			if(i+3>str.length())
				break;
			String s=str.substring(i,i+3);
			if(k.equals(s))
			{
				count++;
			}
		}
		System.out.println(count);
		count=0;
        for(int i=0;i<str.length();i++)
        {
        	if(str.length()<k.length())
				break;
			if(i+3>str.length())
				break;
			String s=str.substring(i,i+3);
			if(k.equals(s))
			{
				count++;
			}
			i=i+2;
        }
        System.out.println(count);
	}

}
