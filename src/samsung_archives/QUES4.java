package samsung_archives;
import java.util.*;
 public class QUES4 
 {
	 ArrayList<ArrayList<Integer>> graph;
      QUES4(int v)
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
     static int count=0;
     public boolean iscyclic(int v,boolean visited[],boolean stk[],String s)
     {
    	 
    	 visited[v]=true;
    	 stk[v]=true;
    	 s+=""+v;
    	 for(int i=0;i<graph.get(v).size();i++)
    	 {
    			 if(!visited[graph.get(v).get(i)] && iscyclic(graph.get(v).get(i),visited,stk,s))
    			 {
    				 //System.out.println(s);
    				 return true;
    			 }
    			 else if(stk[graph.get(v).get(i)])
    			 {
    				 for(int k=graph.get(v).get(i);k<stk.length;k++)
    				 {
    					 if(stk[k])
    						 System.out.print(k+" ->"); 
    				 }
    				 return true;
    			 }
    	 }
    	 stk[v]=false;
    	 s="";
    	 return false;
     }
    public boolean checkc()
    {
    	 boolean vis[]=new boolean[graph.size()];
    	 boolean cstk[]=new boolean[graph.size()];
    	 for(int src=7;src<graph.size();src++)
    	 {
    		 if(iscyclic(src,vis,cstk,""))
    			 return true;
    	 }
    	 return false;	 
    }
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 int t=sc.nextInt();
    	 while(t!=0)
    	 {
    	 int V=sc.nextInt();
    	 QUES4 q =new QUES4(V);
    	 int e=sc.nextInt();
    	 while(e!=0)
    	 {
    		 int u=sc.nextInt();
    		 int v=sc.nextInt();
    		 q.add(u, v);
    		 e--;
    	 }
    	 System.out.println(q.graph);
    	if(q.checkc())
    	 System.out.println(1);
    	 else 
    		 System.out.println(0);
    	 t--;
    	 }
     }
  }