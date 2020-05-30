package algojava;
import java.util.*;
public class encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int n=sc.nextInt();
		    String str=sc.next();
		    int l=str.length();
		    if(n%2!=0)
		      l=l-1;
		    String s="";
             for(int i=0;i<l;i+=2)
             {
                 char ch=str.charAt(i);
                 char ch1=str.charAt(i+1);
                 s+=ch1;
                   s+=ch;
             }
             if(n%2!=0)
             {
            	 s+=str.charAt(n-1);
             }
             String res="";
             for(int i=0;i<s.length();i++)
             {
            	 char ch=(char)(122-(s.charAt(i)-97));
            	 res+=ch;
             }
             System.out.println(res);
       t--;
	}

}
}
