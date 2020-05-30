package DAILYCODE;
import java.util.*;
public class anagrm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			String s1=sc.next();
		    String s2=sc.next();
		    if(s1.length()<s2.length())
		    {
		    	String temp=s1;
		    	s1=s2;
		    	s2=temp;
		    }
			int a[]=new int[26];
			//System.out.println(a['b'-'a']+'b'-'a');
			for(int i=0;i<s1.length();i++)
			{
				a[s1.charAt(i)-'a']++;
			}
			for(int i=0;i<s2.length();i++)
			{
				char ch=s2.charAt(i);
					a[ch-'a']--;
			}
		int count=0;
		for(int i=0;i<26;i++)
		{
			count+=Math.abs(a[i]);
		}
			System.out.println(count);
			t--;
		}

	}

}
