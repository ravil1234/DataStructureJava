package backtracking;
import java.util.*;
public class sum_up {
	static HashMap<String,Integer> h=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
      int s=sc.nextInt();
      Arrays.sort(a);
     // sum(a,s,0,"");
      print(a,0,s,"");
	}
	public static void sum(int a[],int s,int i,String ans)
	{
		if(s==0)
		{
		   if(!h.containsKey(ans))
		   {
			  System.out.println(ans);
		      h.put(ans,1);
		   }
		}
		if(i==a.length||s<0)
			return;
			   sum(a,s-a[i],i+1,ans+a[i]+" ");
			   sum(a,s,i+1,ans);
			   
	}
	public static void  print(int a[],int i,int s,String res)
	{
	     
	    if(s==0)
	    {
	    
	     if(!h.containsKey(res))
	     {
	         String n=res.substring(0,res.length()-1);
	         System.out.print("("+n+")");
	         h.put(res,1);
	        // count++;
	     }
	    }
	    if(i==a.length||s<0)
	         return;
	    print(a,i+1,s-a[i],res+a[i]+" ");
	    print(a,i+1,s,res);
	    
	}
}
