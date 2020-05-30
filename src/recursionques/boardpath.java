package recursionques;
import java.util.*;
public class boardpath {
	static int count=0;
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
   ArrayList<String> res=path(0,n,m);
   for(int i=0;i<res.size();i++)
   {
	   String s=res.get(i);
	   System.out.print(s+" ");
   }
   System.out.println();
    System.out.println(count);
    }
   public static ArrayList<String> path(int cur,int end,int m)
   {
	   if(cur==end)
	   {
		   count++;
		   ArrayList<String> bs=new ArrayList<>();
		   bs.add("");
		   return bs;
	   }
	   if(cur>end)
	   {
		   ArrayList<String> b=new ArrayList<>();
		   return b;
	   }
	   ArrayList<String> res=new ArrayList<>();
	   for(int i=1;i<=m;i++)
	   {
		   ArrayList<String> s=path(cur+i,end,m);
//		   System.out.println(s);
		 for(String rrs:s)
		 {
			 res.add(i+rrs);
		 }
	   }
	   return res;
	 
   }
}