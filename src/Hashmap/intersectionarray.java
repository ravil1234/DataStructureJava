package Hashmap;
import java.util.*;
public class intersectionarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=	new Scanner(System.in);
		int a[]= {5,1,3,4,7};
		int b[]= {2,4,3,5,7,10,15};
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			
			h.put(a[i],1);
			
		}
		for(int i=0;i<b.length;i++)
		{
			if(h.containsKey(b[i]))
			    h.put(b[i],h.get(b[i])+1);
			else
			{
				h.put(b[i],1);
			}
		}
         Set<Map.Entry<Integer,Integer>> entries=h.entrySet();
         for(Map.Entry<Integer, Integer> ent:entries)
         {
        	 if(ent.getValue()==2)
        	 System.out.print(ent.getKey()+" ");
         }
	}

}
