package GRAPH;
import java.util.*;
public class GraphAdj 
{
	  int mat[][];
      GraphAdj(int v)
      {
    	  mat=new int[v+1][v+1];
      }
      public void addEdge(int u,int v,int cost)
      {
    	 mat[u][v]=cost;
    	 mat[v][u]=cost;
      }
      public int removeEdge(int u,int v)
      {
    	  int temp=mat[u][v];
    	  mat[u][v]=0;
    	  mat[v][u]=0;
    	  return temp;
      }
      public boolean containsEdge(int u,int v)
      {
    	  if(mat[u][v]!=0)
    		  return true;
    	  return false;
      }
      public int  noEdges()
      {
    	  int count=0;
    	  for(int i=1;i<mat.length;i++)
    	  {
    		  for(int j=1;j<mat[0].length;j++)
    		  {
    			  if(mat[i][j]!=0)
    				  count++;			  
    		  }
    	  }
    	  return count/2;
      }
      public void display()
      {
    	  System.out.println("------------------");
    	  for(int i=1;i<mat.length;i++)
    	  {
    		  String str=i+"->";
    		  for(int j=1;j<mat[0].length;j++)
    		  {
    			  if(mat[i][j]!=0)
    			  str+=j+"['"+mat[i][j]+"'],";
    		  }
    		  System.out.println(str);
    	  }
    	  System.out.println("------------------");
      }
  public boolean haspath(int src,int dest,HashMap<Integer,Boolean> visited)
  {
	  if(src==dest)
	  return true;
	  visited.put(src,true);
	   for(int j=1;j<mat[0].length;j++)
	   {
		  if(mat[src][j]!=0&&!visited.containsKey(j))
		  {
			  boolean res=haspath(j,dest,visited);
			  if(res)
				  return true;
		  }
	   }
	   return false;  
  }
  public void allpath(int src,int dest,String str,HashMap<Integer,Boolean> visited)
  {
	  if(src==dest)
	  {
		  System.out.println(str);
		  str="1";
		  return;
	  }
	  visited.put(src,true);
	  for(int j=1;j<mat[0].length;j++)
	  {
		  if(mat[src][j]!=0&&!visited.containsKey(j))
		  {
			allpath(j,dest,str+"->"+j,visited);
		  }
	  }
	visited.remove(src);
  }
  class Pair
  {
	  int vname;
	  String psf;
  }
  public boolean bfs(int src,int dest)
  {
	  //HashMap<Integer,Boolean> visited=new HashMap<>();
	  boolean visited[]=new boolean[mat[0].length];
	  LinkedList<Pair> q=new LinkedList<>();
	  Pair p=new Pair();
	  p.vname=src;
	  p.psf=""+src;
	  q.addFirst(p);
	  while(!q.isEmpty())
	  {
		  Pair rv=q.removeLast();
		  if(visited[rv.vname])
		  {
			  continue;
		  }
		  if(rv.vname==dest)
		  {
			  System.out.println(rv.psf);
			  return true;
		  }
		  visited[rv.vname]=true;
		  for(int i=1;i<mat[0].length;i++)
		  {
			  if(mat[rv.vname][i]!=0&&!visited[i])
			  {
				Pair pn=new Pair();
				pn.vname=i;
				pn.psf=rv.psf+"->"+i;
				q.addFirst(pn);
			  }
		  }
	  }
	  return false;
  }
  public boolean dfs(int src,int dest)
  {
	 boolean visited[]=new boolean[mat[0].length];
	 LinkedList<Pair> stk=new LinkedList<>();
	 Pair p=new Pair();
	 p.vname=src;
	 p.psf=""+src;
	 stk.addLast(p);
	 while(!stk.isEmpty())
	 {
		 Pair rv=stk.removeLast();
		 if(visited[rv.vname])
			 continue;
		 if(rv.vname==dest)
		 {
			 System.out.println(rv.psf+"");
			 return true;
		 }
		 visited[rv.vname]=true;
		 for(int i=1;i<mat[0].length;i++)
		 {
			 if(mat[rv.vname][i]!=0&&!visited[i])
			 {
				 Pair pd=new Pair();
				 pd.vname=i;
				 pd.psf=rv.psf+"->"+i;
				 stk.addLast(pd);
			 }
		 }
	 }
	 return false;
	 
  }
  public void bft()
  {
	  boolean visited[]=new boolean[mat[0].length];
	  LinkedList<Pair> q=new LinkedList<>();
	  int count=0;
	  for(int src=1;src<mat[0].length;src++)
	  {
		  if(visited[src])
			  continue;
	  count++;
	  Pair p=new Pair();
	  p.vname=src;
	  p.psf=""+src;
	  q.addFirst(p);
	  while(!q.isEmpty())
	  {
		  Pair rv=q.removeLast();
		  if(visited[rv.vname])
		  {
			  continue;
		  }
		  
		 System.out.println(rv.vname+" via "+rv.psf);
		  visited[rv.vname]=true;
		  for(int i=1;i<mat[0].length;i++)
		  {
			  if(mat[rv.vname][i]!=0&&!visited[i])
			  {
				Pair pn=new Pair();
				pn.vname=i;
				pn.psf=rv.psf+"->"+i;
				q.addFirst(pn);
			  }
		  }
	  }
	 }
	  if(count==1)
		  System.out.println("yes connected graph");
  }
  public boolean cyclic()
  {
	 boolean visited[]=new boolean[mat[0].length];
	 LinkedList<Pair> q=new LinkedList<>();
	 for(int src=1;src<mat[0].length;src++)
	 {
		 if(visited[src])
			 continue;
		 Pair p=new Pair();
		 p.vname=src;
		 p.psf=""+src;
		 q.addFirst(p);
		 while(!q.isEmpty())
		 {
			 Pair rv=q.removeLast();
			 if(visited[rv.vname])
			 {
				 return true;
			 }
			 visited[rv.vname]=true;
			 for(int i=1;i<mat[0].length;i++)
			 {
				 if(mat[rv.vname][i]!=0&&!visited[i])
				 {
					 Pair pd=new Pair();
					 pd.vname=i;
					 pd.psf=rv.psf+"->"+i;
					 q.addFirst(pd);
				 }
			 } 
		 }
	 }
	 return false;
  }
      public static void main(String args[])
      {
    	GraphAdj g=new GraphAdj(5);
    	g.addEdge(1, 2, 15);
    	g.addEdge(1, 5, 12);
    	g.addEdge(1, 3, 11);
    	g.addEdge(2, 5, 13);
    	g.addEdge(3, 4, 14);
    	g.addEdge(4, 5, 16);
    	g.display();
    	HashMap<Integer,Boolean> h;
    	//System.out.println(g.haspath(1,4,h=new HashMap<>()));
    	//g.allpath(1,4,"1",h=new HashMap<>());
    	System.out.println(g.bfs(1,4));
    	System.out.println(g.dfs(1,4));
    	g.bft();
    	System.out.println(g.cyclic());
      }
}
