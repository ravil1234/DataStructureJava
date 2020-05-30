package SEP_PRACTICE;
import java.util.*;
public class CODECHEF {
	static ArrayList<Integer> data=new ArrayList<>();
	
	public static void add(int item)
	{
		data.add(item);
		upheapify(data.size()-1);
	}
	public static void upheapify(int ci)
	{
		int pi=(ci-1)/2;
		if(data.get(ci)<data.get(pi))
		{
			swap(ci,pi);
			upheapify(pi);
		}
	}
	public static void swap(int ci,int pi)
	{
		int ith=data.get(ci);
		int jth=data.get(pi);
		data.set(ci,jth);
		data.set(pi,ith);
	}
	public static int get()
	{
		return data.get(0);
	}
	public  static void downheapify(int pi)
	{
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mini=pi;
		if(lci<data.size()&& data.get(lci)>data.get(mini))
		{
			mini=lci;
		}
		if(rci<data.size()&&data.get(rci)>data.get(mini))
		{
			mini=rci;
		}
		if(mini!=pi)
		{
			swap(pi,mini);
			downheapify(mini);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//CODECHEF h=new CODECHEF();
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
		    int a[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   a[i]=sc.nextInt();
		   }
		   add(a[0]);
		   int count=1;
		   for(int i=1;i<5;i++)
		   {
			   add(a[i]);
			   if(a[i]==data.get(0))
			   {
				   System.out.println(a[i]);
				   count++;
			   }
		   }
		   int g=0;
		   for(int i=5;i<n;i++)
		   {
			   int l=a[g];
			   int k=data.indexOf(l);
			   data.set(k,a[i]);
			   int pi=(k-1)/2;
			   if(data.get(k)<data.get(pi))
			     upheapify(k);
			     else
			     downheapify(k);
			   if(data.get(0)==a[i])
			   {
				   System.out.println(a[i]);
				   count++;
			   }
			   g++;
		   }
		   t--;
		   System.out.println(count);
		}
		
	}
}
