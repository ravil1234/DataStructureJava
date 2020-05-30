package recursion_revision;
import java.util.*;
public class board_path {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(getboardpath(0,end,n));
		printboardpath(0,end,n,"");

	}
public static ArrayList<String> getboardpath(int start,int end,int n)
{
	if(start==end)
	{
		ArrayList<String> base=new ArrayList<>();
		base.add("");
		return base;
	}
	if(start>end)
	{
		ArrayList<String> base=new ArrayList<>();
		return base;
	}
	ArrayList<String> myres=new ArrayList<>();
	for(int i=1;i<=n;i++)
	{
		ArrayList<String> rec=getboardpath(start+i,end,n);
		for(String r:rec)
		{
			myres.add(i+r);
		}
	}
	return myres;
}
public static void printboardpath(int start,int end,int n,String ans)
{
	if(start==end)
	{
		System.out.println(ans);
		return;
	}
	if(start>end)
	{
		return;
	}
	for(int i=1;i<=n;i++)
	{
		printboardpath(i+start,end,n,ans+i);
	}
 }

}
