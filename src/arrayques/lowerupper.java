package arrayques;
import java.util.*;
public class lowerupper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        char c=sc.nextLine().charAt(0);
        upper(c);
        if(c>=65&&c<=90)
        {
        	System.out.print("UPPERCASE");
        }
        else if(c>=97&&c<=122)
        {
        	System.out.print("lowercase");
        }
        else
        	System.out.print("Invalid");
	}
	public static void upper(char c)
	{
	int count=0;
		for(char ch='a';ch<'z';ch++)
		{
			if(c==ch)
			{
				count=1;
				System.out.print('L');
				break;
			}
		}
		for(char ch='A';ch<'Z';ch++)
		{
			if(c==ch)
			{
				count=1;
				System.out.print('U');
				break;
			}
		}
		if(count==0)
		{
			System.out.print('I');
		}
	}

}
