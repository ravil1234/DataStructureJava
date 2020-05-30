package STACKQUEUEchallenge;
import java.util.*;
public class strongestfighter {
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	  a[i]=sc.nextInt();
     }
     int k=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        int max=a[0];
        for(int i=0;i<k;i++)
        {
        	q.add(a[i]);
        	if(max<a[i])
        	{
        		max=a[i];
        	}
        }
        System.out.print(max+" ");
        q.remove();
        max=a[1];
        int j=2;
        for(int i=k;i<n;i++)
        {
        	q.add(a[i]);
        	
        	System.out.print(max+" ");
        	max=a[j];
        	j++;
        }
	}
}
