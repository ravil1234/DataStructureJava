package GRAPH;
import java.util.*;
public class BFS {
	
	// VERTEX CLASS FOR MAKING ONE VERTEX
	public class vertex
	{
		HashMap<String,Integer> nbs=new HashMap<>();
	}
	HashMap<String,vertex> vts=new HashMap<>();
	
	// ADDITION OF VERTEX IN GRAPH
  public void add_vertex(String v1)
  {
	 vertex v=new vertex();
	 vts.put(v1,v);
  }
  //ADDITION OF EDGE BTW TWO VERTEX
  public void add_edge(String v1,String v2,int cost)
  {
	  vertex vts1=vts.get(v1);
	  vertex vts2=vts.get(v2);
	  if(vts1==null||vts2==null|| vts1.nbs.containsKey(v2))
	  {
		  return;
	  }
	  vts1.nbs.put(v2,cost); 
	  vts2.nbs.put(v1,cost); 
  }
  //COUNTING TOTAL VERTEX AND EDGES
  
	public int total_vertex()
	{
		return vts.size();
	}
	public int total_edges()
	{
		int count=0;
	     for(String i:vts.keySet())
	     {
	    	 vertex v=vts.get(i);
	    	 count=count+ v.nbs.size();
	     }
	     return count/2;
	}
	// REMOVING VERTEX
	public void remove_vertex(String v1)
	{
		vertex v=vts.get(v1);
		for(String i:v.nbs.keySet())
		{
			v.nbs.remove(i);
		}
		vts.remove(v1);
	}
	
	//REMOVING EDGE
	public void remove_edge(String v1,String v2)
	{
	    vertex v=vts.get(v1);
	    vertex v3=vts.get(v2);
	    if(v==null ||v3==null|| !v.nbs.containsKey(v2))
	    {
	    	return;
	    }
	    v.nbs.remove(v2);
	    v3.nbs.remove(v1);
	}
	
	//CHECKING CONNECTION BTW TWO VERTEX
	
	public boolean containsEdge(String v1 ,String v2)
	{
		vertex vtx1=vts.get(v1);
		vertex vtx2=vts.get(v2);
		if(vtx1==null|| vtx2==null || !vtx1.nbs.containsKey(v2))
		{
			return false;
		}
		return true;
	}
	// DISPLAYING GRAPH
	public void display()
	{
 	   for(String i:vts.keySet()) 
 	   {
 		   vertex v=vts.get(i);
 		   System.out.println(i+":"+v.nbs);
 	   }
	}
	// TRVERSING PATH BTW TWO NODES
	
	public boolean hashpath(String v1,String v2,HashMap<String,Boolean> process)
	{
		process.put(v1,true);
		if(containsEdge(v1, v2))
		{
			return true;
		}
		vertex v=vts.get(v1);
		for(String i:v.nbs.keySet())
		{
			if(!process.containsKey(i)&&hashpath(i,v2,process))
			{
				return true;
			}
		}
		return false;
	}
	
	// PAIR CLASS FOR SRC AND PROCESSED PATH
	
	private class Pair
	{
		String sf;
		String pfs;
	}
	// BFS TRAVERSAL FROM SRC TO DEST.
	
	public boolean bfs(String src ,String dest)
	{
		HashMap<String,Boolean> processed =new HashMap<>();
		
		 LinkedList<Pair> que=new LinkedList<>();   // linked list treat it as queue
		 Pair p=new Pair();
		 p.sf=src;
		 p.pfs=src;
		 que.addLast(p);

		 while(!que.isEmpty())
		 {
			 Pair r=que.removeFirst();
			 if(processed.containsKey(r.sf)) //processed if r.sf has already traversed.
			 {
				 continue;
			 }
			 processed.put(r.sf,true);    // putting value of r.sf in hashmap;
			 
			 if(containsEdge(r.sf,dest))   // if r.sf is equal to destination then return;
			 {
				 System.out.println(r.pfs+dest);
				 return true;
			 }
			 vertex v=vts.get(r.sf);     // this tells number of connections of r.sf;
			 for(String i:v.nbs.keySet())
			 {
				 if(!processed.containsKey(i))
				 {
				 Pair pn=new Pair();
				 pn.sf=i;
				 pn.pfs=r.pfs +i;
				 que.addLast(pn); 
				 }	 
			 }
		  }
		 return false;
	  }
	// DFS TRAVERSAL FROM SRC TO DEST
	public boolean dfs(String src,String dest)
	{
		LinkedList<Pair> stk=new LinkedList<>();
	   HashMap<String,Boolean> processed=new HashMap<>();
	   Pair p=new Pair();
	   p.sf=src;
	   p.pfs=src;
	   stk.addFirst(p);
	   while(!stk.isEmpty())
	   {
		   Pair r=stk.removeFirst();
		   if(processed.containsKey(r.sf))
		   {
			   continue;
		   }
		   processed.put(r.sf,true);
		   if(containsEdge(r.sf,dest))
		   {
			   System.out.println(r.pfs+dest);
			 return true;  
		   }
		   vertex v=vts.get(r.sf);
		   for(String i:v.nbs.keySet())
		   {
			   if(!processed.containsKey(i))
			   {
				   Pair pn=new Pair();
				   pn.sf=i;
				   pn.pfs=r.pfs+i;
				   stk.addFirst(pn);
			   }
		   }
	   }
	   return false;
	}
	// BFT TRAVERSAL OF GRAPH
	
	public void bft()
	{
		LinkedList<Pair> que=new LinkedList<>();
		HashMap<String,Boolean> b=new HashMap<>();
		int flag =0;
		for(String i:vts.keySet())
		{
			if(b.containsKey(i))
			{
				continue;
			}
			flag++;
		Pair p=new Pair();
	     p.sf=i;
	     p.pfs=i;
	     que.addLast(p);
	     while(!que.isEmpty())
	     {
	    	 Pair r=que.removeFirst();
	    	 if(b.containsKey(r.sf))
	    	 {
	    		 continue;
	    	 }
	    	 System.out.println(r.sf + " -> " + r.pfs);
	    	  b.put(r.sf,true);
	    	 vertex v=vts.get(r.sf);
	    	 for(String k:v.nbs.keySet())
	    	 {
	    		 if(!b.containsKey(k))
	    		 {
	    		 Pair pn=new Pair();
	    		 pn.sf=k;
	    		 pn.pfs=r.pfs+k;
	    		 que.addLast(pn);
	    		 }
	    	 }
	     }
	     System.out.println("hello");
		}
		if(flag>=2)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}
	// DFT TRAVERSAL OF GRAPH
	
	public void dft()
	{
		LinkedList<Pair> stk=new LinkedList<>();	
		//HashMap<String,Integer> processed=new HashMap<>();
		for(String i:vts.keySet())
		{
//			if(processed.containsKey(i))
//			{
//				continue;
//			}
			HashMap<String,Integer> processed=new HashMap<>();
			Pair p=new Pair();
			p.sf=i;
			p.pfs=i;
			stk.addFirst(p);
			System.out.println("*-----"+i+"-----*");
			while(!stk.isEmpty())
			{
				Pair r=stk.removeFirst();
				if(processed.containsKey(r.sf))
				{
					continue;
				}
				processed.put(r.sf,0);
				System.out.println(r.sf+"->"+r.pfs);
				vertex v=vts.get(r.sf);
				for(String k:v.nbs.keySet())
				{
					if(!processed.containsKey(k))
					{
						Pair pn=new Pair();
						pn.sf=k;
						pn.pfs=r.pfs+k;
						stk.addFirst(pn);
					}
				}
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BFS B=new BFS();
		B.add_vertex("0");
		B.add_vertex("1");
		B.add_vertex("2");
		B.add_vertex("3");
		B.add_vertex("4");
		B.add_vertex("5");
		B.add_vertex("6");
		B.add_vertex("7");
		B.add_vertex("8");
		B.add_vertex("9");
		B.add_vertex("10");
		//B.add_vertex("G");
		B.add_edge("0", "1", 1);
		B.add_edge("0", "2", 2);
		B.add_edge("2", "3", 3);
		B.add_edge("0", "4", 3);
		B.add_edge("2", "5", 4);
		
		B.add_edge("5", "6", 1);
		B.add_edge("3", "7", 2);
		B.add_edge("6", "8", 3);
		B.add_edge("8", "9", 3);
		B.add_edge("9", "10", 4);
		B.display();
	//	System.out.println(B.bfs("A", "F"));// ALWAYS GIVE SHORTEST PATH.
		//System.out.println(B.dfs("A", "F"));// DIDNT GIVE SHORTEST PATH ALWAYS.   
		//B.bft();
		B.dft();
	}
}
