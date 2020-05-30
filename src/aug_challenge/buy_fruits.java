package aug_challenge;
import java.util.*;
public class buy_fruits 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t!=0)
	  {
	  int n=sc.nextInt();
	  int m=sc.nextInt();
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
     HashMap<Integer,Integer> h=new HashMap<>();
     int max=Integer.MAX_VALUE;
     for(int i=0;i<n;i++)
     {
    	if(h.containsKey(a[i]))
    	{
    		h.put(a[i],h.get(a[i])+b[i]);
    	}
    	else
    		h.put(a[i],b[i]);
     }
     
     Collection<Integer> k=h.values();
     
     for(Integer i:k)
     {
    	 if(max>i)
    		 max=i;
     }
     System.out.println(max);
     t--;
	 }
  }
}
