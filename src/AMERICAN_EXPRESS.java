import java.util.*;
public class AMERICAN_EXPRESS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int q=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap<>();
			for(int i=0;i<n;i++)
			{
				int x=sc.nextInt();
				h.put(i,x);
			}
			while(q!=0)
			{
				int y=sc.nextInt();
				int r=h.get(y);
				int z=y+1;
				while(z<=n-1)
				{
					if(r>h.get(z))
					{
						h.put(z,0);
					}
					z++;
				}
				q--;
			}
			Collection<Integer> f=h.values();
			for(Integer i:f)
			{
			   System.out.print(i+" ");
			}
		System.out.println();
			t--;
		}

	}

}
