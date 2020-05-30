package Hashmap;
import java.util.*;
public class intersection_arr {
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
				h.put(x,1);
		}
		HashMap<Integer,Integer> k=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			if(k.containsKey(x))
			{
				k.put(x,k.get(x)+1);
			}
			else
				k.put(x,1);
		}
		System.out.println(intersection(h,k,n));

	}
public static ArrayList<Integer> intersection(HashMap<Integer,Integer> h,HashMap<Integer,Integer> k,int n)
{
  Set<Map.Entry<Integer,Integer>> e=h.entrySet();
  ArrayList<Integer> a=new ArrayList<>();
  for(Map.Entry<Integer, Integer> i:e)
  {
	  int min=0;
	 if(k.containsKey(i.getKey()))
	 {
	     if(i.getValue()>k.get(i.getKey()))
	     {
	    	min=k.get(i.getKey());
	     }
	     else
	     {
	    	 min=i.getValue();
	     }
	     while(min!=0)
		 {
			 a.add(i.getKey());
			 min--;
		 }
	 }
  }
  return a;
}

}
