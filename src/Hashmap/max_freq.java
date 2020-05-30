package Hashmap;
import java.util.*;
public class max_freq {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Integer> h=new HashMap<>();		
		for(int i=0;i<s.length();i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i),h.get(s.charAt(i))+1);
			}
			else
			{
				h.put(s.charAt(i),1);
			}
		}
		System.out.println(h);
		/*   when only value has to find */
		Collection<Integer> freq=h.values();
		int max=0;
		for(Integer i:freq)
		{
			if(max<i)
				max=i;
		}
		System.out.println(max);
		
		/*   when both key and value  has to find */
		Set<Map.Entry<Character, Integer>> e=h.entrySet();
		max=0;
		char mf=' ';
		for(Map.Entry<Character, Integer> i:e)
		{
			if(max<i.getValue())
			{
				max=i.getValue();
				mf=i.getKey();
			}
		}
		System.out.println(mf+" frequency = "+max);
	}

}
