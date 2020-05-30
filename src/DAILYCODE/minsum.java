package DAILYCODE;
import java.util.*;
public class minsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int k=sc.nextInt();
			String str=sc.next();
			int f=1;
			int a[]=new int[10000];
			int j=0;
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(i<str.length()-1)
				{
					char ch2=str.charAt(i+1);
					if(ch==ch2)
					{
						f++;
						if(i+1==str.length()-1)
						{
							a[j]=f;
							j++;
							f=1;
							break;
						}
					}
					else
					{
						a[j]=f;
						j++;
						f=1;
					}
				}
				else
				{
					a[j]=1;
					j++;
				}
			}
			while(k!=0)
			{
				//max(a);
				k--;
			}
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
			       sum=sum+(int)(Math.pow(a[i],2));
			}
			System.out.println(sum);
			t--;
		}

	}
	

}
