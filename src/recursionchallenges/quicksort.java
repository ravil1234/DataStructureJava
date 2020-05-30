package recursionchallenges;
import java.util.*;
public class quicksort {
	static Scanner sc=new Scanner(System.in);
	public static int n=sc.nextInt();
	static long a[]=new long[n];	
   void random(int low,int high) 
    { 
      
        Random rand= new Random(); 
        int pivot = rand.nextInt(high-low) + low; 
        long temp1=a[pivot]; 
        a[pivot]=a[high]; 
        a[high]=temp1; 
    } 
	public static void main(String[] args) {
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
		}
	    quicksort q=new quicksort();
	    q.random(0, n-1);
	    for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	    System.out.println();
	    q.quicks(a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	public void quicks(long a[],int s,int l)
	{
		if(s>=l)
		{
			return;
		}
		int p=quick(a,s,l);
		quicks(a,s,p-1);
		quicks(a,p+1,l);
		
	}
	public static int quick(long a[],int s,int l)
	{
		int i=s-1;
		for(int j=s;j<l;j++)
		{
			if(a[j]<=a[l])
			{
				i++;
			  long temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			}
			
		}
		long temp=a[i+1];
		a[i+1]=a[l];
		a[l] =temp;
		return i+1;
	}

}
