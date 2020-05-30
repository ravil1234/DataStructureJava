package recursionchallenges;
import java.util.*;
public class movex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     String str=sc.next();
	     move(str,0,"","");
	

	}
	public static void move(String str,int i,String res,String s)
	{
		if(i==str.length())
		{
			s=s+res;
			System.out.println(s);
			return;
		}
		char ch1=str.charAt(i);
		if(ch1=='x')
		{
			 res=res+'x';
		}
		else
		{
			 s=s+ch1;
		}
		move(str,i+1,res,s);
	}

}
