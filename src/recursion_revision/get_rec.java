package recursion_revision;
import java.util.*;
public class get_rec {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
	   //1.get sub sequence of string
	   System.out.println(getsubseq(str));
	   
	   //2.get subsequence for ascii
		System.out.println(getasc(str));
		
	   // 3.print subsequence
		printss(str,"");
		System.out.println();
		
	//4.print subsequence ascii
		printasc(str,"");
	// 5. get permutation
		System.out.println();
		System.out.println(getpermu(str));
		printpermu(str,"");
	}
	public static ArrayList<String> getsubseq(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> base=new ArrayList<>();
			base.add("");
			return base;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myres=new ArrayList<>();
		ArrayList<String > rec=getsubseq(ros);
		for(int i=0;i<rec.size();i++)
		{
			myres.add(rec.get(i));
			myres.add(cc+rec.get(i));
		}
		return myres;
	}
	public static ArrayList<String> getasc(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> base=new ArrayList<>();
			base.add("");
			return base;
		}
		char cc=str.charAt(0);
		String s=Integer.toString((int)cc);
		String ros=str.substring(1);
		ArrayList<String> myres=new ArrayList<>();
		ArrayList<String > rec=getasc(ros);
		for(int i=0;i<rec.size();i++)
		{	
			myres.add(rec.get(i));
			myres.add(cc+rec.get(i));
			myres.add(s+rec.get(i));
		}
		
		return myres;
	}
	
	public static void printss(String str,String res)
	{
		if(str.length()==0)
		{
			System.out.print(res+" ");
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printss(ros,res);
		printss(ros,res+cc);
		
	}
	public static void printasc(String str,String res)
	{
		if(str.length()==0)
		{
			System.out.print(res+" ");
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printasc(ros,res);
		printasc(ros,res+cc);
		printasc(ros,res+(Integer.toString((int)cc)));
	}
	public static ArrayList<String> getpermu(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> base=new ArrayList<>();
			base.add("");
			return base;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> res=getpermu(ros);
		ArrayList<String> myres=new ArrayList<>();
		for(String i:res)
		{
			for(int j=0;j<=i.length();j++)
			{
			  String s=i.substring(0,j)+cc+i.substring(j);
			  myres.add(s);
			}
		}
	return myres;	
	}
	public static void printpermu(String str,String res)
	{
		if(str.length()==0)
		{
			System.out.print(res+" ");
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			printpermu(ros,res+ch);
		}
	}
}
