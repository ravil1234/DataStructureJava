package DAILYCODE;
import java.util.*;
public class max_freq {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap<>();
		int max=1;
		int y=0;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			if(h.containsKey(x))
			{
				h.put(x,h.get(x)+1);
				if(max<h.get(x))
				{
					max=h.get(x);
					y=x;
				}
			}
			else
			{
				h.put(x,1);
			}
		}
		System.out.println(y);

	}

}
