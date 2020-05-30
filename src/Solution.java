import java.util.*;

public class Solution {

	public static void main(String[] args) {
    		// TODO Auto-generated method stub
  System.out.println(getKth(1,1,1));
  
	}
	public static int getKth(int lo, int hi, int k) 
    {
        TreeMap<Integer,ArrayList<Integer>> h=new TreeMap<>();
        for(int i=lo;i<=hi;i++)
        {
            int count=0;
            int value=i;
            while(true)
            {
                if(value%2==0)
                {
                    value=value/2;
                }
                else
                {
                    value=(value*3)+1;
                }
                count++;
                if(value==1)
                	break;
            }
            if(h.containsKey(count))
            {
                ArrayList<Integer> a=h.get(count);
                a.add(i);
                h.put(count,a);
            }
            else
            {
                ArrayList<Integer> a=new ArrayList<>();
                a.add(i);
                h.put(count,a);
            }
        }
        ArrayList<Integer> b=new ArrayList<>();
        for(ArrayList<Integer> a:h.values())
        {
            Collections.sort(a);
            for(int i=0;i<a.size();i++)
                b.add(a.get(i));
        }
        return b.get(k-1);
    }
}
