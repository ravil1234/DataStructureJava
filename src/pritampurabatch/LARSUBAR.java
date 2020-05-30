package pritampurabatch;
import java.util.*;
public class LARSUBAR {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	        int h=0,k=0,g=0,g1=0;
	        int s=0;
	        for(int i=0;i<n;i++)
	        {
	            int even=0;
	            int odd=0;
	            for(int j=i;j<n;j++)
	            {
	              if(a[j]==1)
	                 even++;
	              else
	                 odd++;
	              if(even==odd)
	                 {
	                        g=j-i;
	                    	 if(g1<g)
	      		           {
	      		               h=i;
	      		               k=j;
	      		               g1=g;
	      		           }    
	                 }
	            }
	            if((even==0||odd==0)&&i==0)
	            {
	                s=1;
	                System.out.println("None");
	                break;
	            }
	        }
	        if(s==0)
	        System.out.println(h+" "+k);
	        t--;
	      }

	}

}
