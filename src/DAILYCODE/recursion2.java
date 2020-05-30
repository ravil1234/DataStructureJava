package DAILYCODE;
import java.util.*;
public class recursion2{
	public static void main(String[] args) {
		System.out.println("enter no.");
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t!=0)
	     {
	     long n=sc.nextInt();
	     ArrayList<Long> k=new ArrayList<>();
	     k.add((long) 1);
	     rec(n,k);
	     t--;
	     }
	}
	public static void rec(long n,ArrayList<Long> k)
	{
		for(int i=0;i<k.size();i++)
		{
			long a=k.get(i);
			if(a%n==0)
			{
				System.out.println(a);
				return ;
			}
		}
	  ArrayList<Long> res=new ArrayList<>();
	  for(int i=0;i<k.size();i++)
	  {
		  res.add((k.get(i)*10)+1);
		  res.add((k.get(i)*10)+0);
	  }
	 k.removeAll(k);
	 k.addAll(res);
	 res.removeAll(res);
	  rec(n,k);
	  
	}

}