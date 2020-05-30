package GRAPH;
import java.util.*;
import Heap.HeapGeneric;

public class Graphprisms {
	public class vertex
	{
      HashMap<String,Integer> nbs=new HashMap<>();		
	}
	public HashMap<String ,vertex> vts=new HashMap<>();
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
 
 class primspair implements Comparable<primspair>
 {
	 String vname;
	 String acq;
	 int cost;
	@Override
	public int compareTo(primspair o) {
		return o.cost-this.cost;
	}
 }
 public Graphprisms prim()
 {
	 Graphprisms mst=new Graphprisms();
	 HashMap<String,primspair> map=new HashMap<>();
	 HeapGeneric<primspair> heap=new HeapGeneric<>();
	 //creation of pairs
	 for(String i:vts.keySet())
	 {
		 primspair p=new primspair();
		 p.vname=i;
		 p.acq=null;
		 p.cost=Integer.MAX_VALUE;
		 heap.add(p);
		 map.put(i,p);
	 }
	 while(!heap.isEmpty())
	 {
		 //remove pair
		 
		 primspair rp=heap.remove();
		 map.remove(rp.vname);
		 
		 //add mst
		 
		 if(rp.acq==null)
		 {
			 mst.addvertex(rp.vname);
		 }
		 else
		 {
			 mst.addvertex(rp.vname);
			 mst.addedge(rp.vname,rp.acq, rp.cost);
		 }
		 for(String nbr:vts.get(rp.vname).nbs.keySet())
		 {
			 if(map.containsKey(nbr))
			 {
				 int oc=map.get(nbr).cost;
				 int nc=vts.get(rp.vname).nbs.get(nbr);
				 if(nc<oc)
				 {
				 primspair gp=map.get(nbr);
				 gp.acq=rp.vname;
				 gp.cost=nc;
				 heap.updatePriority(gp);
				 }
			 }
		 }
	 }
	return mst; 
}
 class dijkstrapair implements Comparable<dijkstrapair>
 {
	 String vname;
	 String psf;
	 int cost;
	@Override
	public int compareTo(dijkstrapair o) {
		return o.cost-this.cost;
	}
 }
 public TreeMap<String ,Integer> dijkstra(String src)
 {
	 TreeMap<String ,Integer> ans=new TreeMap<>();
    HeapGeneric<dijkstrapair> heap=new HeapGeneric<>();
  //   PriorityQueue<dijkstrapair> heap=new  PriorityQueue<>();
     HashMap<String,dijkstrapair> map=new HashMap<>();
     for(String i:vts.keySet())
     {
     	 dijkstrapair p=new dijkstrapair();
    	 p.vname=i;
    	 p.psf="";
    	 p.cost=Integer.MAX_VALUE;
    	 if(src.equals(i))
    	 {
    		 p.psf=i;
    		 p.cost=0;
    		 
    	 }
    	 heap.add(p);
    	 map.put(i,p);
     }
     while(!heap.isEmpty())
     {
    	 dijkstrapair rp=heap.remove();
    	 map.remove(rp.vname);
    	 ans.put(rp.vname,rp.cost);
    	 for(String nbr:vts.get(rp.vname).nbs.keySet())
    	 {
    		 if(map.containsKey(nbr))
    		 {
    			 int oc=map.get(nbr).cost;
    			 int nc= rp.cost+vts.get(rp.vname).nbs.get(nbr);
    			 if(nc<oc)
    			 {
    				 dijkstrapair gp=map.get(nbr);
    				 gp.psf=rp.psf+nbr;
    				 gp.cost=nc;
    				 heap.updatePriority(gp);
    			 }
    		 }
    	 }
    	 
     }
     return ans;
 }
  public static void main(String args[])
  {
	  Graphprisms g=new Graphprisms();
	  g.addvertex("1");
	  g.addvertex("2");
	  g.addvertex("3");
	  g.addvertex("4");
	  //g.addvertex("E");
	  //g.addvertex("F");
	  //g.addvertex("G");
	 /*----------add edge-----------*/
	  g.addedge("1", "2", 24);
	  g.addedge("1", "4", 20);
	  g.addedge("3", "1", 3);
	  g.addedge("4", "3", 12);
	//  g.addedge("D", "E", 8);
	  //g.addedge("E", "F", 5);
	  //g.addedge("E", "G", 7);
	  //g.addedge("F", "G", 9);
	  g.display();
	  //g.prim().display();
	  System.out.println(g.dijkstra("4"));
  }
}
