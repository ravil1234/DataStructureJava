package arrayques;
import java.util.*;
public class string1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter a string");
	String str=sc.next();
	int k=sc.nextInt();
	int a[]=new int[100];
	int b[]=new int[100];
	int x=0,y=0;
   for(int i=0;i<str.length();i++)
	{
	   char ch=str.charAt(i);
		if(ch=='a')
		{
			a[x]=i;
		      x++;
		}
		else
		{
			b[y]=i;
			y++;
		}
	}
   if(x>y)
   {
	   for(int j=0;j<y;j++)
	   {
		  String newstr=str.substring(0,b[j])+'b'+str.substring(b[j]+1);
		  
		   
	   }
   }
	

	}

}
