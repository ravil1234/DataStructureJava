package GRAPH;
import java.util.*;
public class graph {
	
	private class vertex
	{
      HashMap<String,Integer> nbs=new HashMap<>();		
	}
	HashMap<String ,vertex> vts=new HashMap<>();
	public int total_vertex()
	{
		return vts.size();
	}
	public void addvertex(String vnm)
	{
		vertex v=new vertex();
		vts.put(vnm, v);
	}
	public void removevertex(String v1)
	{
		vertex vtx=vts.get(v1);
		ArrayList<String> st=new ArrayList<>(vtx.nbs.keySet());
		for(String i:st)
		{
			vertex v=vts.get(i);
			v.nbs.remove(v1);
		}
		vts.remove(v1);
	}
	public int total_edge()
	{
		ArrayList<String> e=new ArrayList<>(vts.keySet());
		int count=0;
		for(String i:e)
		{
		   vertex v=vts.get(i);
			count=count+ v.nbs.size();
		}
		return count/2;
	}
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
	public void addedge(String v1,String v2,int cost)
	{
		vertex vtx1=vts.get(v1);
		vertex vtx2=vts.get(v2);
		if(vtx1==null|| vtx2==null || vtx1.nbs.containsKey(v2))
		{
			return;
		}
       vtx1.nbs.put(v2,cost);
       vtx2.nbs.put(v1, cost);
	}
  public void remove_edge(String v1,String v2)
  {
	  vertex vtx1=vts.get(v1);
	  vertex vtx2=vts.get(v2);
	  if(vtx1==null ||vtx2==null ||!vtx1.nbs.containsKey(v2))
	  {
		  return;
	  }
	 vtx1.nbs.remove(v2);
	 vtx2.nbs.remove(v1);
  }
  public void display()
  {
	 // ArrayList<String > k=new ArrayList<>(vts.keySet());
	  for(String i:vts.keySet())
	  {
		  vertex v=vts.get(i);
		  System.out.println(i +" : "+v.nbs);
	  }
	  System.out.println("-----------end------------");
  }
 public boolean hashpath(String vname,String v2,HashMap<String,Boolean> h)
 {
	h.put(vname,true);
	 if(containsEdge(vname,v2))
	 {
		 return true;
	 }
	 vertex v=vts.get(vname);
	 ArrayList<String> a=new ArrayList<>(v.nbs.keySet());
	 for(String i:a)
	 {
		 if(!h.containsKey(i)&&hashpath(i,v2,h))
		 {
			 return true;
		 }
	 }
	 return false;
 }
  public static void main(String args[])
  {
	  graph g=new graph();
	  g.addvertex("A");
	  g.addvertex("B");
	  g.addvertex("C");
	  g.addvertex("D");
	  g.addvertex("E");
	  g.addvertex("F");
	  
	 /*----------add edge-----------*/
	  g.addedge("A", "B", 10);
	  g.addedge("A", "C", 2);
	  g.addedge("A", "F", 1);
	  g.addedge("A", "E", 4);
	  g.addedge("B", "D", 7);
	  g.addedge("D", "F", 9);
	  g.addedge("C", "E", 11);
	  g.addedge("F", "B", 18);
	  g.display();
	  g.removevertex("A");
	  g.display();
	  System.out.println(g.hashpath("D","C",new HashMap<>()));
	  /*
	  System.out.println(g.total_vertex());
	  System.out.println(g.total_edge());
	  System.out.println(g.containsEdge("A", "F"));
	  g.remove_edge("A", "F");
	  g.display();
	  System.out.println(g.containsEdge("A", "F"));
	  g.removevertex("E");
	  g.display();
	  g.addvertex("R");
	  g.display();
	  g.addedge("R", "B", 19);
	  g.display();
	  */
	  
  }
}
