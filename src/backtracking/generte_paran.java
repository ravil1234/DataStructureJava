package backtracking;
import java.util.*;
public class generte_paran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
		 paran(n,0,0,"");
	    }
		public static void paran(int n,int o,int c,String ans)
		{
			if(c==n)
			{
				System.out.println(ans);
				return;
			}
			if(o>c)
			{
				paran(n,o,c+1,ans+")");
			}
			if(o<n)
			{
				paran(n,o+1,c,ans+"(");
			}
		}
	}