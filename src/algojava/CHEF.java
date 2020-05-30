package algojava;
import java.util.*;
public class CHEF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
String s1=sc.nextLine();
while(t!=0)
{
	String str=sc.nextLine();
	String a[]=str.split(" ");
	if(a.length==1)
	{
		a[0]=a[0].toLowerCase();
		char ch=(char)(a[0].charAt(0)-32);
		System.out.println(ch+a[0].substring(1));
	}
	else if(a.length==2)
	{
		a[0]=a[0].toLowerCase();
		char ch=(char)(a[0].charAt(0)-32);
		a[1]=a[1].toLowerCase();
		char ch1=(char)(a[1].charAt(0)-32);
		System.out.println(ch+"."+ch1+a[1].substring(1));
	}
	else
	{
		a[0]=a[0].toLowerCase();
		char ch=(char)(a[0].charAt(0)-32);
		a[1]=a[1].toLowerCase();
		char ch1=(char)(a[1].charAt(0)-32);
		a[2]=a[2].toLowerCase();
		char ch2=(char)(a[2].charAt(0)-32);
		System.out.println(ch+"."+ch1+"."+ch2+a[2].substring(1));
	}
	t--;
  }

	}

}
