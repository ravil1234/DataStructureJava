package GeeksforGeeks;

/*package whatever //do not write package name here */
import java.util.*;
class GFG {
	
    static	class Pair
    	{
    	    int vname;
    	    int psf;
    	    String pf;
    	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int graph[][]=new int[n+1][n+1];
		    int m=sc.nextInt();
		    while(m!=0)
		    {
		        int u=sc.nextInt();
		        int v=sc.nextInt();
		        graph[u][v]=1;
		        graph[v][u]=1;
		        m--;
		    }
		    int c=0;
		   boolean visited[]=new boolean[n+1];
		   Stack<Integer> s=new Stack<>();
		    for(int i=1;i<=n;i++)
		    {
		    	//visited[i]=true;
		        if(ishamil(i,graph,visited,s,n))
		        {
		            c=1;
		            System.out.println(1);
		            break;
		        }
		        //visited[i]=false;
		    }
		    if(c==0)
		    System.out.println(0);
	}
	public static boolean ishamil(int src,int graph[][],boolean visited[],Stack<Integer> s,int n)
	{
		s.push(src);
		if(s.size()==n)
			return true;
		visited[src]=true;
		for(int i=1;i<=n;i++)
		{
			if(!visited[i]&&graph[src][i]!=0)
			{
				ishamil(i,graph,visited,s,n);
			}
		}
		//visited[src]=false;
		//s.pop();
		return false;
	}	
	
}