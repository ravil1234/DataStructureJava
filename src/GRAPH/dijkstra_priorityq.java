package GRAPH;
import java.util.*;
public class dijkstra_priorityq {
	public class vertex
	{
      HashMap<String,Integer> nbs=new HashMap<>();		
	}
	public HashMap<String ,vertex> vts=new HashMap<>();
	public void addvertex(String vnm)
	{
		vertex v=new vertex();
		vts.put(vnm, v);
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
	class dijkstrapair implements Comparable<dijkstrapair>
	 {
		 String vname;
		 String psf;
		 int cost;
		@Override
		public int compareTo(dijkstrapair o) {
			if(o.cost<this.cost)
				return 1;
			if(o.cost>this.cost)
				return -1;
			return 0;
		}
	 }
	 public HashMap<String,Integer> dijkstra(String src)
	 {
		 HashMap<String ,Integer> ans=new HashMap<>();
		 PriorityQueue<dijkstrapair> heap=new  PriorityQueue<>();
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
	    	 //ans.put(rp.vname,rp.cost);
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
	    				 ans.remove(gp.psf);
	    				 gp.psf=rp.psf+nbr;
	    				 gp.cost=nc;
	    				 dijkstrapair up=gp;
	    				heap.remove(gp);
	    				ans.put(up.vname,rp.cost);
	    				 heap.add(up);
	    			 }
	    		 }
	    	 }
	    	 
	     }
	     return ans;
	 }
	  public static void main(String args[])
	  { 
		  
		  Scanner sc=new Scanner(System.in);
		  int t=sc.nextInt();
		  while(t!=0)
		  {
			  dijkstra_priorityq g=new dijkstra_priorityq();
			  int v=sc.nextInt();
			  for(int i=1;i<=v;i++)
			  {
				  g.addvertex(Integer.toString(i));
			  }
			  int e=sc.nextInt();
			  for(int i=0;i<e;i++)
			  {
				  String v1=sc.next();
				  String v2=sc.next();
				  int cost=sc.nextInt();
				  g.addedge(v1, v2, cost);
			  }
			  String src=sc.next();
			  HashMap<String,Integer> h=g.dijkstra(src);
			  System.out.println(h);
			  String a[]=new String[v];
			  int j=0;
			  for(String i:h.keySet())
			  {
				  a[j]=i;
				  j++;
			  }
			  Arrays.sort(a);
			  for(int i=0;i<v;i++)
			  {
				  if(h.containsKey(a[i])&&!a[i].equals(src))
				  {
					  if(h.get(a[i])<Integer.MAX_VALUE)
						System.out.print(h.get(a[i])+" ");
					  else
						  System.out.print(-1+" ");
				  }
			  }
			  System.out.println();
			  t--;
		  }
		 
	  }
	}
