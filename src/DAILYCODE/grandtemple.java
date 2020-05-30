package DAILYCODE;
import java.util.*;
public class grandtemple {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum1=0,sum2=0;
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	   a[i]=sc.nextInt();
    	   b[i]=sc.nextInt();
      }
      Arrays.sort(a);
      Arrays.sort(b);
      int max1=0,max2=0;
      for(int i=n-1;i>0;i--)
      {
    	  sum1=a[i]-a[i-1];
    	  sum2=b[i]-b[i-1];
    	  if(max1<sum1)
    	  {
    		max1=sum1;  
    	  }
    	  if(max2<sum2)
    	  {
    		  max2=sum2;
    	  }
      }
      System.out.println((max1-1)*(max2-1));
	}

}
