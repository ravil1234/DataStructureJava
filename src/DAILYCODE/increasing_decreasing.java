package DAILYCODE;
import java.util.*;
public class increasing_decreasing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int i=0;
		int count=0;
	   for(i=1;i<n;i++)
	   {
		   if(min>a[i])
		   {
			   count++;
			  min=a[i]; 
		   }
		   else
			   break;
	   }
	   
	   for(int j=i;j<n;j++)
	   {
		   if(min<a[j])
		   {
			   count++;
			   min=a[j];
		   }
		   else
			   break;
	   }
	   if(count==n-1)
	   {
		   System.out.println("true");
	   }
	   else
	   {
		   System.out.println("false");
	   }
	}

}
