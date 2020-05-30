package DAILYCODE;
import java.util.*;
public class checksum {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t!=0)
	{
		int count=0,c=0;
		String s=sc.next();
		int g=0;
		for(int i=0;i<s.length();i++)
		{
			count=0;
			String s1= s.substring(g,i+1);
			long first=Integer.valueOf(s1);
			System.out.println("1st "+first);
			for(int j=s1.length();j<s.length();j++)
			{
				String s2=s.substring(s1.length(),j+1);
				long second=Integer.valueOf(s2);
				System.out.println("2nd "+second);
				for(int k=s1.length()+s2.length();k<s.length();k++)
				{
					String s3=s.substring(s1.length()+s2.length(),k+1);
					long third=Integer.valueOf(s3);
					System.out.println("3rd "+third);
					if((first+second)==third)
					{
						count=1;
						i=s3.length();
						g=i;
						break;
					}
				}
				if(count==1)
				{
					c=1;
					break;
				}
				
			}
		}
		if(c==1)
			System.out.println("true");
		else
			System.out.println("false");
		t--;
	}
		
	}

}
