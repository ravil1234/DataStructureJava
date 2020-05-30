package GRAPH;
import java.util.*;
public class topological_sort 
{
	ArrayList<ArrayList<Integer>> graph;	
	topological_sort(int v)
	{
	 graph=new ArrayList<>();
	 for(int i=0;i<v;i++)
	 {
		 ArrayList<Integer> res=new ArrayList<>();
		 graph.add(res);
	 }
	}
	public void add(int u,int v)
	{
		graph.get(u).add(v);
	}
	public void topological(int vertex,boolean visited[],Stack<Integer> stk)
	{
		visited[vertex]=true;
		for(Integer i:graph.get(vertex))
		{
			if(!visited[i])
				topological(i,visited,stk);
		}
		stk.push(vertex);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ne=sc.nextInt();
		int v=sc.nextInt();
		topological_sort g=new topological_sort(v);
		for(int i=0;i<ne;i++)
		{
			int u =sc.nextInt();
			int V=sc.nextInt();
			g.add(u, V);
		}
		boolean vis[]=new boolean[v];
		Stack<Integer> stk=new Stack<>();
		for(int src=0;src<v;src++)
		{
			if(!vis[src])
				g.topological(src,vis,stk);
		}
		while(!stk.isEmpty())
		{
			System.out.print(stk.pop()+" ");
		}
	}
}
