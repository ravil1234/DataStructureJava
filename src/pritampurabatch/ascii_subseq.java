package pritampurabatch;
import java.util.*;
public class ascii_subseq {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	    char c[]=new char[str.length()];
	    String c1[]=new String[str.length()];
		sequence(str,c,0,0,c1);

	}
	
	public static void sequence(String str,char out[],int i,int j, String out2[])
	{
		if(i==str.length())
		{
		     for(int k=0;k<j;k++)
		     {
		    	 System.out.print(out[k]);
		     }
		    
		     //count++;
		     System.out.print(" ");
			return;
		}
		sequence(str,out,i+1,j,out2);
		out[j]=str.charAt(i);
		int k=(int)str.charAt(i);
		String s="";
		s=s+k;
		out2[j]=s;
		sequence(str,out,i+1,j+1,out2);
	}

}
