package LINKELIST;
import java.util.*;
public class addnodeclient {
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		ADDLAST ad=new ADDLAST();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			ad.addlast(a);
		}
		ad.display();
		System.out.println(ad.getlast());
		System.out.println(ad.getfirst());
		System.out.println(ad.getatvalue(5));
		ad.removeat(3);
		ad.reverseptr();
		ad.display();
		System.out.println(ad.midnode());
	}

}
