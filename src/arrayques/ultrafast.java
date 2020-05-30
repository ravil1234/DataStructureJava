package arrayques;
import java.util.*;
public class ultrafast {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			String a=sc.next();
			String b=sc.next();
			String s="";
			for(int i=0;i<a.length();i++)
			{
				char ch=a.charAt(i);
				char ch2=b.charAt(i);
				if(ch==ch2)
					s=s+'0';
				else
					s=s+'1';
			}
			System.out.println(s);
			t--;
		}

	}

}
