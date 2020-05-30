package pritampurabatch;
import java.util.*;
public class subset_count {

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
             int max=0,max1=0;
             for(int i=0;i<n;i++)
             {
            	 int sum=a[i];
            	for(int j=i+1;j<n;j++)
            	{
            		sum=sum+a[j];
            		if(sum>0)
            		{
            		   max=(j-i);	
            		}		
            	}
            	if(max1<max)
            	{
            		max1=max;
            	}
             }
             System.out.println(max1+1);
             t--;
         }

	}

}

