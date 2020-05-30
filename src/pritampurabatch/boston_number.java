package pritampurabatch;
import java.util.*;
public class boston_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
      boolean a[]=new boolean[n+1];
      for(int i=0;i<n;i++)
      {
    	  a[i]=true;
      }
      for(int p=2;p*p<=n;p++)
      {
    	  if(a[p]==true)
    	  {
    		  for(int i=p*p;i<=n;i=i+p)
    		  {
    			  a[i]=false;
    		  }
    	  }
      }
      String s="";
      int k=1;
      int m=n;
      for(int i=2;i<Math.sqrt((int)n);)
      {
    	  if((a[i]==true)&&m%i==0)
    	  {
    		  k=k*i;
    		  s=s+i;
    		  if(k==n)
    		  {
    			  break;
    		  }
    		  m=m/i;
    	  }
    	  else
    	  {
    		  i++;
    	  }
      }
      int sum=0;
      for(int i=0;i<s.length();i++)
      {
    	  int g=Character.getNumericValue(s.charAt(i));
    	  sum=sum+g;
      }
      int sum2=0;
      while(n!=0)
      {
    	  int r=n%10;
    	  sum2=sum2+r;
    	  n=n/10;
      }
      if(sum2==sum)
      {
    	  System.out.println("1");
    	  
      }
      else
      {
    	  System.out.println("0");
      }
	}

}
