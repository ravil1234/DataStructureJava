package DAILYCODE;
import java.util.*;
public class ultra_fast {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			String s1=sc.next();
			String s2=sc.next();
			String s3="";
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				char ch1=s2.charAt(i);
				if(ch==ch1)
				{
					s3+=0;
				}
				else
				{
					s3+=1;
				}
			}
			System.out.println(s3);
			t--;
		}
	}

}
