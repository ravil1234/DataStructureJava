package Hashmap;
import java.util.*;
public class MAX_XOR {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max=0;
		int xor;
		for(int i=0;i<n;i++)
		{
		  HashMap<Integer,Integer> h=new HashMap<>();
		    xor=a[i];
		    if(max<xor)
		    {
		    	max=xor;
		    }
		    h.put(a[i],1);
		   for(int j=i+1;j<n;j++)
		   {
			if(h.containsKey(a[j]))
			{
				xor=xor^a[j];
				if(max<xor)
				{
					max=xor;
				}
				break;
			}
			else
			{
				h.put(a[j],1);
				xor=xor^a[j];
				if(max<xor)
				{
					max=xor;
				}
			 }
		   }
		}
		System.out.println(max);
	}

}
