package DAILYCODE;
import java.util.*;
public class cb_numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int count=0;
		int p[]= {2,3,5,7,11,13,17,19,23,29};
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			int g=i;
			for(int j=i+1;j<=s.length();j++)
			{
				String s1=s.substring(g,j);
				System.out.println(s1);
				long l=Long.parseLong(s1);
				if(l>29)
				{
				  int c=0;
				for(int k=0;k<p.length;k++)
				{
					if(l%p[k]==0)
					{
						c=1;
						break;
					}
				}
				if(c==0)
				{
					count++;
					g=j;
				}
			}
				else
				{
					int c=0;
					for(int k=0;k<p.length;k++)
					{
						if(l==p[k])
						{
							count++;
							c=1;
							break;
						}
					}
					if(c==1)
					{
						g=j;
					}
				}		
		    }
			if(max<count)
			{
				max=count;
			}
			count=0;
	  }
		System.out.println(max);
	}

}
