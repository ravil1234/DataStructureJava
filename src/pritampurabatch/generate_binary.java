package pritampurabatch;
import java.util.*;
public class generate_binary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		String str=sc.next();
		binary(str,0);
		System.out.println();
		Integer.bitCount(-10);
		t--;
		}
	}
public static void binary(String str,int i)
 {
	if(i==str.length())
	{
		System.out.print(str+" ");
		return;
	}
	 char ch=str.charAt(i);
	if(ch=='?')
	{
		str=str.substring(0,i)+'0'+str.substring(i+1);
	     binary(str,i+1);	
	     str=str.substring(0,i)+'1'+str.substring(i+1);
	     binary(str,i+1);	
	}
	else
	{
		binary(str,i+1);
	}
   }
}
