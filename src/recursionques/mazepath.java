package recursionques;
import java.util.*;
public class mazepath {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter grid");
       int m=sc.nextInt();
       int n=sc.nextInt();
       System.out.print(mazep(0,0,m,n));
	}
	public static ArrayList<String> mazep(int cr,int cc,int er,int ec)
	{
		if(cr==er-1&&cc==ec-1)
		{
			 ArrayList<String> b=new ArrayList<>();
			    b.add(" ");
				return b;
		}
		if(cr>(er-1)||(cc>ec-1))
		{
		ArrayList<String> br=new ArrayList<>();
		return br;
		}
		ArrayList<String> res=new ArrayList<>();
		ArrayList<String> rh=mazep(cr,cc+1,er,ec);
		for(String rrh:rh)
		{
			res.add("H"+rrh);
			
		}
		ArrayList<String> rv=mazep(cr+1,cc,er,ec);
		for(String rrv:rv)
		  {
			res.add("V"+rrv);
		  }	  
		return res;
	}
}
