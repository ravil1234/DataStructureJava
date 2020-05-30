package arrayques;
import java.util.*;
public class chewbacca {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		String str=sc.next();
		String str1="";
		int i=0;
		while(i<str.length())
		{
		char ch=str.charAt(i);
		int a=Character.getNumericValue(ch);
		int g=9-a;
		if(i==0&&g==0)
		{
			str1=str1+9;
		}
		else if(g<=a&&(i!=0||g!=0))
		{
			str1=str1+g;
		}
		else
		{
			str1=str1+ch;
		}
		i++;	
		}
		System.out.println(str1);

	}

}
