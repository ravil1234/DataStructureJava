package SEP_PRACTICE;
import java.util.*;
public class substring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new 	Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			String s=sc.next();
			String r=sc.next();
			if(s.length()>=r.length()&&s.compareTo(r)!=0)
			{
				System.out.println("Impossible");
			}
			else if(s.compareTo(r)==0)
			{
				System.out.println(s);
			}
			else
			{
				String s1="";
				String s2="";
				int c=0;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				int count=0;
				for(int j=0;j<r.length();j++)
				{
					char ch1=r.charAt(j);
					if(ch==ch1)
					{
						count=1;
						s1=s1+ch;
					r=r.substring(0,j)+'*'+r.substring(j+1);
						break;
					}
				}
				if(count==0)
				{
					c=1;
					System.out.println("Impossible");
					break;
				}
			}
           if(c==0)
           {
        	   for(int j=0;j<r.length();j++)
        	   {
        		   char ch1=r.charAt(j);
        		   if(ch1!='*')
					{
						s2=s2+ch1;
					}
        	   }
        	   char s3[]=s2.toCharArray();
        	   Arrays.sort(s3);
        	   String s4=new String(s3);
        	   System.out.print(s1);
        	   System.out.println(s4);
        	   
           }
			}
			t--;
		}
	}

}
