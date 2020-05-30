package DAILYCODE;
import java.util.*;
public class intersectionarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		ArrayList<Integer> res=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		if(a[i]==b[j])
	    		{
	    			res.add(a[i]);
	    			b[j]=Integer.MIN_VALUE;
	    			break;
	    		}
	    	}
	    }
	    Collections.sort(res);
	    System.out.println(res);
	}
}
