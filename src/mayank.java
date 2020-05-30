import java.util.*;
public class mayank {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int t=sc.nextInt();
		while(t!=0) {
			
			int f=0;
	     	String str=sc.next();
			int j=0,c=0,k=0,i;
			for(i=0;i<s.length();i++)
			{
				if(s.charAt(i)==str.charAt(j)) 
				 {
					  if(j==0)
					   {
						k=i;
					   }
					j++;
					c++;
					if(c==str.length()) {
						f=1;
					    break;
					}
				}
			}
			if(f==1)
			System.out.println("Possible "+k+" "+i);
			else 
			System.out.println("Not Possible");
			t--;
		}
    }
}