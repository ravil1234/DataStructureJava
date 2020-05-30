package Hashmap;
import java.util.*;
public class subarray_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		long sum=0;
		for(int i=0;i<n;i++)
		{
			HashMap<Integer,Integer> h=new HashMap<>();
			for(int j=i;j<n;j++)
			{
				if(h.containsKey(a[j]))
				{
					break;
				}
				else
				{
					h.put(a[j],1);
					sum+=h.size();
				}
			}
		}
		System.out.println(sum%(long)(Math.pow(10, 9)+7));
	}

}
