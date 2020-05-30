package codsule;
import java.util.*;
public class bobstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k,max=0,min=99;
		for(char ch=0;ch<128;ch++)
		{
		 k=0;
		for(int i=0;i<s.length();i++)
		{
			char ch2=s.charAt(i);
			if(ch==ch2)
			{
				k++;
			}
		}
		if(max<k)
		{
			max=k;
		}
		if(min>k&&k!=0)
		{
			min=k;
		}

	}
		System.out.print(max-min);
}
}
