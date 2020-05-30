package bitmasking;
import java.util.*;
public class set_bit {
	public static void main(String[] args) {
		
		//set ith bit =1.
		
         Scanner sc=new Scanner(System.in);
         System.out.println((5^6));
         int n=sc.nextInt();
         int i=sc.nextInt();
         reset_bit(n,i);
         int j=1;
         j=j<<(i-1);  //this tells mask .
         n=n|(j);
         System.out.println(n);
	}
	public static void reset_bit(int n,int i)
	{
		 int j=1;
         j=j<<(i-1);
         j=~(j);
         n=n&j;
         System.out.println(n);
	}

}
