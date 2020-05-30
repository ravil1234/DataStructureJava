package arrayques;
import java.util.*;
public class max_freq {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int max=0;
		char s=' ';
		for(char c=0;c<256;c++)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(c==ch)
				{
					count++;
				}
			}
			if(max<count)
			{
				max=count;
				 s=c;
			}
		}
		System.out.print(s);
    }
}
