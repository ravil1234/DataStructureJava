package algojava;
import java.util.*;
public class stringfreq {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		int k=1,c=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		char ch1=' ';
		if(i<str.length()-1)
		{
		    ch1=str.charAt(i+1);
			if(ch==ch1)
			{
				k++;
			}
			else
			{
				System.out.print(ch);
				if(k!=1)
				System.out.print(k);
				k=1;
			}
		}
		if(ch==ch1&&(i+1==str.length()-1))
		{
			c=1;
			System.out.print(ch);
			if(k!=1)
			System.out.print(k);
			break;
		}
		
	}
	if(c==0)
	{
			k=1;
			System.out.print(str.charAt(str.length()-1));
			if(k!=1)
			System.out.print(k);
	}
	
	}	

}
