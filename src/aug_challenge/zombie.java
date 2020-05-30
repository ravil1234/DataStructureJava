package aug_challenge;
import java.util.*;
public class zombie {
	static int n;
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t!=0)
	  {
		   n=sc.nextInt();
		  long c[]=new long[n];
		  long h[]=new long[n];
		  long a[]=new long[n+1];
		  long b[]=new long[n];
		  for(int i=0;i<n;i++)
		  {
			  a[i]=0;
		  }
		  for(int i=0;i<n;i++)
		  {
			  c[i]=sc.nextLong();
		  }
		  for(int i=0;i<n;i++)
		  {
			  h[i]=sc.nextLong();
		  }
		       for(int i=0;i<n;i++)		      
		       {
		    	   long p=i-c[i];
		    	   if(p<0)
		    	   {
		    		   p=0;
		    	   }
		    	   long p1=i+c[i];
		    	   if(p1>=n)
		    	   {
		    		   p1=n-1;
		    	   }
		         update(a,p,p1); 
		         
		    }
		       updateArray(a,n);
		       for(int i=0;i<n;i++)
		       {
		    	  b[i]=a[i];
		       }
		       Arrays.sort(b);
		       Arrays.sort(h);
		       if(Arrays.equals(b, h)==true)
		       {
		    	   System.out.println("YES");
		       }
		       else
		    	   System.out.println("NO");
			    t--;
	  }
	}
	public static void update(long D[], long l, long r) 
    { 
        D[(int)l] += 1;
        if(l!=n-1)
        D[(int)r + 1] -= 1; 
    } 
	public static void updateArray(long arr[], int N) 
    {  
        for (int i = 1; i < N; i++) 
            arr[i] += arr[i - 1]; 
    } 
}
	/*
	 public static boolean eql(long arr1[], long arr2[]) 
	    { 
	        long n = arr1.length; 
	        long m = arr2.length; 
	        if (n != m) 
	            return false;
	        Map<Long, Long> map = new HashMap<Long, Long>(); 
	        long count = 0; 
	        for ( int i = 0; i < n; i++) { 
	            if (map.get(arr1[i]) == null) 
	                map.put(arr1[i],(long) 1); 
	            else { 
	                count = map.get(arr1[i]); 
	                count++; 
	                map.put(arr1[i], count); 
	            } 
	        } 
	        for (int i = 0; i < n; i++) { 
	            if (!map.containsKey(arr2[i])) 
	                return false; 
	            if (map.get(arr2[i]) == 0) 
	                return false; 
	            count = map.get(arr2[i]); 
	            --count; 
	            map.put(arr2[i], count); 
	        } 
	  
	        return true; 
	    } 

*/
