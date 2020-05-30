package GeeksforGeeks;
import java.util.*;
public class subset_sum {
	static ArrayList<Integer> s=new ArrayList<>();
	public static void main (String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0)
	 {
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	       
	    }
	    subset(a,0,0);
	    Collections.sort(s);
	    for(Integer i:s)
	    {
	    	System.out.print(i+" ");
	    }
	    System.out.println();
	    s=new ArrayList<>();
	   t--;
	}
	}
	public static void subset(int a[],int sum,int i)
	{
		if(i>a.length)
			return;
		if(i==a.length)
		{
			s.add(sum);
			return;
		}
		subset(a,sum+a[i],i+1);
		subset(a,sum,i+1);
      		
	}
}
