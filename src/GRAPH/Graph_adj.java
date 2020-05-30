package GRAPH;
import java.util.*;
public class Graph_adj {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
	     int v=sc.nextInt();
	     int e=sc.nextInt();
	     int m[][]=new int[v][v];
	     for(int i=0;i<v;i++)
	     {
	    	 for(int j=0;j<v;j++)
	    	 {
	    		 m[i][j]=0;
	    	 }
	     }
	     for(int k=0;k<e;k++)
	     {
	    	 int m1=sc.nextInt();
	    	 int m2=sc.nextInt();
	    	 int cost=sc.nextInt();
	    	 m[m1-1][m2-1]=cost;
	    	 m[m2-1][m1-1]=cost;
	     }
	    
	    int src=sc.nextInt();    
	     dijkstra(m,src-1,v);
	     t--;
	     System.out.println();
		}
	}
	
	public static void dijkstra(int graph[][],int src,int v)
	{
		int dist[]=new int[v];
		boolean processed[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			dist[i]=Integer.MAX_VALUE;
			processed[i]=false;
		}
		dist[src]=0;
		for(int c=0;c<v-1;c++)
		{
			int u=min_dist(dist,processed);
			processed[u]=true;
			for(int k=0;k<v;k++)
			{
				if(!processed[k]&&graph[u][k]!=0&&dist[u]!=Integer.MAX_VALUE&&
						dist[u]+graph[u][k]<dist[k])
				{
					dist[k]=dist[u]+graph[u][k];
				}
			}
		}
		for(int i=0;i<v;i++)
		{
			if(i!=src)
			{
			if(dist[i]==Integer.MAX_VALUE)
			{
		    System.out.print(-1+" ");
			}
			else
			System.out.print(dist[i]+" ");
		   }
		}
	}
public static int min_dist(int dist[],boolean processed[])
{
	int min=Integer.MAX_VALUE;
	int ret_min=-1;
	for(int i=0;i<dist.length;i++)
	{
		if(processed[i]==false&&dist[i]<=min)
		{
			min=dist[i];
			ret_min=i;
		}
	}
	return ret_min;
}
}
