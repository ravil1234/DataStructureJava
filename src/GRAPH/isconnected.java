package GRAPH;
import java.util.*;
public class isconnected {
	public class vertex
	{
		HashMap<String,Integer> nbs=new HashMap<>();
	}
	HashMap<String,vertex> vts=new HashMap<>();
	
	// add vertex
	public void addvertex(String v1)
	{
		vertex v=new vertex();
        vts.put(v1,v);		
	}
// total vertex
	public int total_vertex()
	{
		return vts.size();
	}
	public void add_edge(String v1,String v2,int cost)
	{
		vertex vt1=vts.get(v1);
		vertex vt2=vts.get(v2);
		if(vt1==null||vt2==null || vt1.nbs.containsKey(v2))
		{
			return;
		}
		vt1.nbs.put(v2,cost);
		vt2.nbs.put(v1, cost);
		
	}
	public int total_edge()
	{
		int count=0;
		for(String i:vts.keySet())
		{
			vertex v=vts.get(i);
			count+=v.nbs.size();
		}
		return count/2;
	}
	public boolean containsEdge(String v1,String v2)
	{
		vertex vt1=vts.get(v1);
		vertex vt2=vts.get(v2);
		if(vt1==null||vt2==null||!vt1.nbs.containsKey(v2))
		{
			return false;
		}
		return true;
	}
	public void remove_edge(String v1,String v2)
	{
		vertex vt1=vts.get(v1);
		vertex vt2=vts.get(v2);
		if(vt1==null ||vt2==null ||!vt1.nbs.containsKey(v2))
		  {
			  return;
		  }
		vt1.nbs.remove(v2);
		vt2.nbs.remove(v1);
	}
	public void remove_vertex(String v)
	{
		for(String i:vts.keySet())
		{
			vertex vt=vts.get(i);
			if(vt.nbs.containsKey(v))
			{
				vt.nbs.remove(v);
			}
		}
		vts.remove(v);
	}
	public void display()
	{
		for(String i:vts.keySet())
		{
			vertex v=vts.get(i);
			System.out.println(i+":"+v.nbs);
		}
	}
	class Pair
	{
		String sf;
		String psf;
	}
	public boolean iscyclic()
	{
		LinkedList<Pair> q=new LinkedList<>();
		HashMap<String,Integer> processed=new HashMap<>();
	   for(String i:vts.keySet())
	   {
		   if(processed.containsKey(i))
		   {
			   continue;
		   }
		   Pair p=new Pair();
		   p.sf=i;
		   p.psf=i;
		   q.addLast(p);
		   while(!q.isEmpty())
		   {
			  Pair r=q.removeFirst();
			  if(processed.containsKey(r.sf))
			  {
				  return true;
			  }
			  processed.put(r.sf,0);
			  vertex v=vts.get(r.sf);
			  for(String j:v.nbs.keySet())
			  {
				  if(!processed.containsKey(j))
				  {
					  Pair pn=new Pair();
					  pn.sf=j;
					  pn.psf=r.psf+j;
					  q.addLast(pn);
				  }
			  }
		   }
	   }
	   return false;
	   
	}
	public boolean isconnect()
	{
		LinkedList<Pair> q=new LinkedList<>();
		HashMap<String,Integer> processed=new HashMap<>();
		int flag=0;
	   for(String i:vts.keySet())
	   {
		   if(processed.containsKey(i))
		   {
			   continue;
		   }
		   flag++;
		   Pair p=new Pair();
		   p.sf=i;
		   p.psf=i;
		   q.addLast(p);
		   while(!q.isEmpty())
		   {
			  Pair r=q.removeFirst();
			  if(processed.containsKey(r.sf))
			  {
				  continue;
			  }
			  processed.put(r.sf,0);
			  vertex v=vts.get(r.sf);
			  for(String j:v.nbs.keySet())
			  {
				  if(!processed.containsKey(j))
				  {
					  Pair pn=new Pair();
					  pn.sf=j;
					  pn.psf=r.psf+j;
					  q.addLast(pn);
				  }
			  }
		   }
		   
	   }
		  
	  if(flag>=2)
	  {
	     return false;
	  }
	  else
	  {
		  return true;
	  }
	   
	}
	public  boolean istree()
	{
		return !iscyclic()&&isconnect();
	}
	
	public ArrayList<ArrayList<String>> getcc()
	{
		LinkedList<Pair> q=new LinkedList<>();
		HashMap<String,Integer> processed=new HashMap<>();
		ArrayList<ArrayList<String>> ans=new ArrayList<>();
		
	   for(String i:vts.keySet())
	   {
		   ArrayList<String> sub=new ArrayList<>();
		   if(processed.containsKey(i))
		   {
			   continue;
		   }
		   Pair p=new Pair();
		   p.sf=i;
		   p.psf=i;
		   q.addLast(p);
		   while(!q.isEmpty())
		   {
			  Pair r=q.removeFirst();
			  if(processed.containsKey(r.sf))
			  {
				  continue;
			  }
			  processed.put(r.sf,0);
			  sub.add(r.sf);
			  vertex v=vts.get(r.sf);
			  for(String j:v.nbs.keySet())
			  {
				  if(!processed.containsKey(j))
				  {
					  Pair pn=new Pair();
					  pn.sf=j;
					  pn.psf=r.psf+j;
					  q.addLast(pn);
				  }
			  }
		   }
		   ans.add(sub);
		   
	   }
		  return ans;
	}
	public static void main(String args[])
	{
		isconnected B=new isconnected();
		B.addvertex("A");
		B.addvertex("H");
		B.addvertex("C");
		B.addvertex("D");
		B.addvertex("E");
		B.addvertex("F");
		B.addvertex("G");
		B.add_edge("A", "H", 10);
		B.add_edge("A", "D", 20);
		B.add_edge("H", "C", 30);
		B.add_edge("D", "C", 30);
		B.add_edge("D", "E", 40);
		B.add_edge("E", "F", 30);
		B.add_edge("E", "G", 40);
		B.add_edge("F", "G", 40);
		B.display();
		B.remove_edge("D", "E");
		System.out.println(B.iscyclic());
		System.out.println(B.isconnect());
		System.out.println(B.istree());
		B.addvertex("B");
	    B.display();
		System.out.println(B.getcc());
	}
}
