package DAILYCODE;
import java.util.*;
public class magicalstring3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int a[]=new int[200];
		for(int i=97;i<=122;i++)
		{
			a[i]=sc.nextInt();
		}
		String s="";
		int max=0,max1=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int l=(int)ch;
			System.out.println(l);
			if(a[l]>0)
			{
				s=s+ch;
				String k=str.substring(i+1);
				if(s.length()>k.length())
					max1=s.length();
				else
					max1=k.length();
				if(max<max1)
				{
					max=max1;
				}
				a[l]=a[l]-1;
				
			}
			else
			{
				s="";
			}
			
		}
		
       System.out.println(max);
	}

}
