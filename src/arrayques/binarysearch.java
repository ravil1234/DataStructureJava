package arrayques;
import java.util.*;
public class binarysearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		System.out.println(binary(a,m,0,n-1));
	}
  public static int binary(int a[],int m,int i,int e)
  {
	  while(i<=e)
	  {
		  int mid=(i+e)/2;
		  if(a[mid]==m)
		  {
			return mid;  
		  }
		  else if(a[mid]>m)
		  {
			  e=mid-1;
		  }
		  else
		  {
			 i=mid+1;
		  }
	  }
	  return -1;
  }
}
