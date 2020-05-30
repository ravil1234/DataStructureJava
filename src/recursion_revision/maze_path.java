package recursion_revision;
import java.util.*;
public class maze_path 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
	  //System.out.println(getmazepath(0,0,m,n));
		//printmazepath(0,0,m,n,"");
		 System.out.println(getmazepathdiag(0,0,m,n));
			printmazepathdiag2(0,0,m,n,"");	
	}
public static ArrayList<String> getmazepath(int cr,int cc,int er,int ec)
{
	if(cr==er-1&&cc==ec-1)
	{
		ArrayList<String> base =new ArrayList<>();
		base.add("");
		return base;
	}
	if(cr>er-1||cc>ec-1)
	{
		ArrayList<String> base =new ArrayList<>();
		return base;
	}
	ArrayList<String> res =new ArrayList<>();
	ArrayList<String> rrh=getmazepath(cr,cc+1,er,ec);
	for(String i:rrh)
	{
		res.add("H"+i);
	}
	ArrayList<String> rrv=getmazepath(cr+1,cc,er,ec);
	for(String i:rrv)
	{
		res.add("V"+i);
	}
	return res;
}
public static void printmazepath(int cr,int cc,int er,int ec,String res)
{
   if(cr==er-1&&cc==ec-1)
   {
	System.out.print(res+" ");
	return;
   }
   if(cr>er-1||cc>ec-1)
   {
	return;
   }
   printmazepath(cr,cc+1,er,ec,res+"H");
   printmazepath(cr+1,cc,er,ec,res+"V");
 }
public static ArrayList<String> getmazepathdiag(int cr,int cc,int er,int ec)
{
	if(cr==er-1&&cc==ec-1)
	{
		ArrayList<String> base =new ArrayList<>();
		base.add("");
		return base;
	}
	if(cr>er-1||cc>ec-1)
	{
		ArrayList<String> base =new ArrayList<>();
		return base;
	}
	ArrayList<String> res=new ArrayList<>();
	ArrayList<String> rrh=getmazepathdiag(cr,cc+1,er,ec);
	for(String i:rrh)
	{
		res.add("H"+i);
	}
	ArrayList<String> rrv=getmazepathdiag(cr+1,cc,er,ec);
	for(String i:rrv)
	{
		res.add("V"+i);
	}
	ArrayList<String> rrd=getmazepathdiag(cr+1,cc+1,er,ec);
	for(String i:rrd)
	{
		res.add("D"+i);
	}
	return res;
}
public static void printmazepathdiag(int cr,int cc,int er,int ec,String res)
{
	if(cr==er-1&&cc==ec-1)
	{
		System.out.print(res+" ");
	}
	if(cr>er-1||cc>ec-1)
	{
		return;
	}
	printmazepathdiag(cr,cc+1,er,ec,res+"H");
	printmazepathdiag(cr+1,cc,er,ec,res+"V");
	printmazepathdiag(cr+1,cc+1,er,ec,res+"D");
	
}
public static void printmazepathdiag2(int cr,int cc,int er,int ec,String res)
{
	if(cr==er-1&&cc==ec-1)
	{
		System.out.print(res+" ");
	}
	if(cr>er-1||cc>ec-1)
	{
		return;
	}
	printmazepathdiag2(cr+1,cc,er,ec,res+"V");
	printmazepathdiag2(cr,cc+1,er,ec,res+"H");
	if(cr==cc)
	printmazepathdiag2(cr+1,cc+1,er,ec,res+"D");
	
}

}



// VVHH VHVH VHHV VHD HVVH HVHV HVD HHVV DVH DHV DD 









