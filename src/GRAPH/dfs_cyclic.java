package GRAPH;
import java.util.*;
public class dfs_cyclic 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		a.add(1);
		a.add(2);
		res.add(a);
		a=new ArrayList<>();
		a.add(0);
		a.add(2);
		a.add(3);
		res.add(a);
		a=new ArrayList<>();
		a.add(0);
		a.add(1);
		res.add(a);
		a=new ArrayList<>();
		a.add(1);
		res.add(a);
		a=new ArrayList<>();
		boolean visited[]=new boolean[4];
		for(int i=0;i<4;i++)
		{
			dfs(res);
		}	
	}
public void dfs(ArrayList<ArrayList<Integer>> res,)
}
