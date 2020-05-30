package Hashmap;
import java.util.*;
public class freqno {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<n;i++)
		{
		  int x=sc.nextInt();
		  if(h.containsKey(x))
		  {
			  h.put(x,h.get(x)+1);
		  }
		  else
		  {
			  h.put(x,1);
		  }
		}
		Set<Map.Entry<Integer, Integer>> e=h.entrySet();
		int max=0;
		int mf=0;
		for(Map.Entry<Integer, Integer> i:e)
		{
			if(max<i.getValue())
			{
				max=i.getValue();
				mf=i.getKey();
			}
		}
		System.out.println(mf);
	}

}
