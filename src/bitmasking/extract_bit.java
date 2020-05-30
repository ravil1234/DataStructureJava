package bitmasking;
import java.util.*;
public class extract_bit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// to find i-th bit in a number n.
		
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=sc.nextInt();
      int j=1;
      j=j<<(i-1);
      n=n&j;
      // now n denotes that if n!=0 then ith bit is 1 else 0;
      if(n==0)
      System.out.println(n);
      else
    	  System.out.println(1);  
	}

}
