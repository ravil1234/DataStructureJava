package recursionchallenges;
import java.util.*;
public class keypadcode {
	static int count;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String alp[]= {" ","abc","def","ghi","jkl",
				      "mno","pqrs","tuv","wx","yz"};
		char res[]=new char[str.length()];
		keypad(str,alp,res ,0,0);
		System.out.println();
		System.out.print(count);
	}
public static void  keypad(String str,String alp[],char res[],int i,int j)
{
         if(i==str.length())
         {
        	 System.out.print(res);
        	 System.out.print(" ");
        	 count++;
        	 return;
         }
         char ch=str.charAt(i);
         int n=Character.getNumericValue(ch);
         String s=alp[n];
         for(int k=0;k<s.length();k++)
         {
        	 char ch1=s.charAt(k);
        	  res[j]=ch1;
         keypad(str,alp,res,i+1,j+1);
         }
 }

}
