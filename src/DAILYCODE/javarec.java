package DAILYCODE;
import java.util.*;
public class javarec {
	public static void main(String[] args) {
		System.out.println("enter no.");
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t!=0)
	     {
	     long n=sc.nextInt();
	     ArrayList<String> k=new ArrayList<>();
	     k.add("1");
	     rec(n,k);
	     t--;
	     }
	}
	public static void rec(long n,ArrayList<String> k)
	{
		for(int i=0;i<k.size();i++)
		{
			long a=Long.parseLong(k.get(i));
			if(a%n==0)
			{
				System.out.println(a);
				return ;
			}
		}
	  ArrayList<String> res=new ArrayList<>();
	  for(int i=0;i<k.size();i++)
	  {
		  res.add(k.get(i)+'1');
		  res.add(k.get(i)+'0');
	  }
	 k.removeAll(k);
	 k.addAll(res);
	 res.removeAll(res);
	  rec(n,k);
	  
	}

}
