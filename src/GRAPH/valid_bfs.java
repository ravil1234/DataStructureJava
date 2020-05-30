package GRAPH;
import java.util.*;
public class valid_bfs 
{
	static Scanner sc=new Scanner(System.in);
	ArrayList<HashSet<Integer>> res=new ArrayList<>();
	
 valid_bfs(int v)
 {
	 for(int i=0;i<v;i++)
	 {
		HashSet<Integer> a=new HashSet<>();
		res.add(a);
	 }
 }
 public void addedge(int u,int v)
 {
	 res.get(u-1).add(v-1);
	 res.get(v-1).add(u-1);
	 
 }
 public void bfs()
 {
	 int b[]=new int[res.size()];
	 for(int i=0;i<b.length;i++)
	 {
		 b[i]=sc.nextInt();
		 b[i]=b[i]-1;
	 }
	 int n=res.size();
	LinkedList<Integer> q=new LinkedList<>();
	 q.addFirst(0);
	 int k=1;
	 if(b[0]!=0)
	 {
		 System.out.print("No");
		 return;
	 }
	 while(!q.isEmpty())
	 {
		 int rv=q.removeLast();
		 while(k < n)
		 {
			 if(res.get(rv).contains(b[k]))
			 {
				 q.addFirst(b[k]);
				 k++;
			 }
			 else
				 break;
		 }
	 }
	 if(k==n)
		 System.out.println("Yes");
	 else
		 System.out.println("No");
 }
	public static void main(String[] args)
	{
		int n=sc.nextInt();
		valid_bfs b=new valid_bfs(n);
		int e=n-1;
		while(e!=0)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			b.addedge(u, v);
			e--;
		}
		b.bfs();
	}
}