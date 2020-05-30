package Hashmap;
import java.util.*;
public class unlock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      HashMap<Integer,Integer> map=new HashMap<>();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  int x=sc.nextInt();
    	  map.put(x,i);
    	  a[i]=x;
      }
      for(int j=n;j>=1;j--)
      {
    	  if(k==0)
    	  {
    		  break;
    	  }
    	  int l=map.get(j);
    	  int bp=n-j;
    	  if(bp!=l)
    	  {
    		  int val=a[bp];
    		  map.put(val,l);
    		  map.put(j, bp);
    		  a[bp]=j;
    		  a[l]=val;
    		  k--;
    	  }
      }
     
      for(int i=0;i<n;i++)
      {
    	  System.out.print(a[i]+" ");
      }
	}

}
