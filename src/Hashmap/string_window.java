package Hashmap;
import java.util.*;
public class string_window {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		 char ch1[]=s2.toCharArray();
		Arrays.sort(ch1);
		String s4=new String(ch1);
		int min=Integer.MAX_VALUE;
		String res=""; 
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<=s1.length();j++)
			{
				String s3=s1.substring(i,j);
				//System.out.println(s3);
			  char ch[]=s3.toCharArray();
			  Arrays.sort(ch);
			  String s5=new String(ch);
			  if(s5.length()>=s4.length())
			  {
			  s5=s5.substring(0,s4.length());
			  if(s5.equals(s4))
			  {
				  int l=s3.length();
				  if(min>l)
				  {
					  min=l;
					  res=s3;
				  }
			  }
			}
		   }
		}
		System.out.println(res);
	}
}
