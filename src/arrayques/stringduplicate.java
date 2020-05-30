package arrayques;
import java.util.*;
public class stringduplicate {
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          String str=sc.next();
          String str1="";
          for(int i=0;i<str.length();i++)
          {
        	  char ch=str.charAt(i);
        	  if(i!=str.length()-1)
        	  {
        	  char ch2=str.charAt(i+1);
        	  if(ch!=ch2)
        		  str1=str1+ch;
               }
        	  else
        		  str1=str1+ch;
          }
          System.out.println(str1);
	}

}
