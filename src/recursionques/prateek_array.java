package recursionques;
import java.util.*;
public class prateek_array {
	public static void main(String[] args) {
		// TODO
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
	        int sum=0;
	        for(int i=0;i<n;i++)
	        {
	        	sum+=a[i];
	        }
	       System.out.println(game(a,sum,0,n));
	       t--; 
		}
	}
	public static int game(int a[],int sum,int low,int high)
	{
		if(low>=high-1)
			return 0;
		int c=0;
		int pos=-1;
        for(int i=low;i<high;i++)
        {
        	c+=a[i];
        	if(sum-c==c)
        	{
        	   pos=i;	
        	   break;
        	}
        }
        if(pos==-1)
        	return 0;
        
        int left=game(a,c,low,pos+1);
        int right=game(a,c,pos+1,high);
		return 1+Math.max(left,right);
	}
}
