package SEP_PRACTICE;
import java.util.*;
public class CAT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		int n=sc.nextInt();
		int b[]=new int[n];
		Arrays.fill(b, 0);
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> h=new HashMap<>();
		int j=1;
		int c=0;
		for(int i=0;i<m;i++)
		{
		     if(h.containsKey(a[i])&&j<=n)
		     {
		    	 c=1;
		    	 break;
		     }
		     else
		     {
		    	 h.put(a[i],1);
		     }
		     if(j==n)
		     {
		    	 h=new HashMap<>();
		    	 j=0;
		     }
		     j++;
		}
	if(c==0)
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
    t--;
   }
		
	}
}
