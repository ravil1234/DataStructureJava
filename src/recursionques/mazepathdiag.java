package recursionques;
import java.util.*;
public class mazepathdiag {

	public static void main(String[] args) {
		System.out.println("enter grid");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(mazediag(0,0,m,n));
	}
	public static ArrayList<String> mazediag(int cr,int cc,int er,int ec)
	{
		if(cr==er-1&&cc==ec-1)
		{
			ArrayList<String> r=new ArrayList<>();
			r.add(" ");
			return r;
		}
		if(cr>er||cc>ec)
		{
			ArrayList<String> br=new ArrayList<>();
			return br;
		}
		
		ArrayList<String> res=new ArrayList<>();
		ArrayList<String> res1=new ArrayList<>();
		
		res1=mazediag(cr+1,cc,er,ec);
		for(String rc:res1)
		{
			res.add("V"+rc);
		}
		res1=mazediag(cr,cc+1,er,ec);
		for(String rr:res1)
		{	
			res.add("H"+rr);
		}
		
		if(cr==cc)
		{
		res1=mazediag(cr+1,cr+1,er,ec);
		for(String rd:res1)
		{	
			res.add("D"+rd);
		}
		}
		return res;
	}

}
