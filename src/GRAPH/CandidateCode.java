package GRAPH;
import java.util.*;
public class CandidateCode {

    int mat[][];
    CandidateCode(int v)
    {
       mat=new int[v+1][v+1];
    }
    public void add(int u,int v)
    {
        mat[u][v]=1;
        mat[v][u]=1;
    }
    public int no_edge()
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
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        CandidateCode c=new CandidateCode(r+1);
       while(r!=0)
       {
           int u=sc.nextInt();
           int v=sc.nextInt();
           c.add(u,v);
           r--;
       }
   System.out.println(c.no_edge());
   }
}