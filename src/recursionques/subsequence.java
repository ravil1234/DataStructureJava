package recursionques;
import java.util.*;
public class subsequence {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	     String str=sc.nextLine();
	    //ArrayList<String> s=seq(str);
	     char c[]=new char[str.length()];
	     //sequence(str,c,0,0);
	     ArrayList<String > s=asc(str);
	     //System.out.println(count%1000000007);
	     //Collections.sort(s);
	     for(int i=0;i<s.size();i++)
	     {
	    	 String k=s.get(i);
	    	 System.out.print(k+" ");
	     }
	   
	}
	/*challenge k according recursion*/
	public static void sequence(String str,char out[],int i,int j)
	{
		if(i==str.length())
		{
		     for(int k=0;k<j;k++)
		     {
		    	 System.out.print(out[k]);
		     }
		     count++;
		     System.out.print(" ");
			return;
		}
		sequence(str,out,i+1,j);
		out[j]=str.charAt(i);
		sequence(str,out,i+1,j+1);
	}
	/* according to ArrayList*/
	public static ArrayList<String> seq(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> bc=new ArrayList<>();
			bc.add(" ");
			return bc;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myres=new ArrayList<>();
		ArrayList<String> myres1=seq(ros);
		for(int i=0;i<myres1.size();i++)
		{
			myres.add(cc+myres1.get(i));	
			myres.add(myres1.get(i));
		}
		return myres;
	}
	public static ArrayList<String> asc(String str)
	{
	    if(str.length()==0)
		{
			ArrayList<String> bc=new ArrayList<>();
			bc.add(" ");
			return bc;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		int s=(char)cc;
	    ArrayList<String> myres=new ArrayList<>();
		ArrayList<String> myres1=seq(ros);
		for(int i=0;i<myres1.size();i++)
		{
			char c1=ros.charAt(0);
			int s1=(char)c1;
			myres.add(myres1.get(i));
			myres.add(cc+myres1.get(i));
			myres.add(s+myres1.get(i));
			myres.add(s1+myres.get(i));
		}
		return myres;
	
	}
}
