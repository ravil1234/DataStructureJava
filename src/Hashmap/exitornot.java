package Hashmap;
import java.util.*;
public class exitornot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		int n=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			h.put(a,1);
		}
		int q=sc.nextInt();
		while(q!=0)
		{
			int x=sc.nextInt();
			if(h.containsKey(x))
			{
		      System.out.println("Yes");
			}
			else
			{
			System.out.println("No");
			}
			q--;
		}
		t--;
	  }
	}

}
