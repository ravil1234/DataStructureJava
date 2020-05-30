package aug_challenge;
import java.util.*;
import java.math.BigInteger;
public class encoding {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
	    int nl=sc.nextInt();
	    String l=sc.next();
	    int nr=sc.nextInt();
	    String r=sc.next();
	    BigInteger b=new BigInteger(l);
	    BigInteger br=new BigInteger(r);
	    BigInteger ten=new BigInteger("10");
	    BigInteger zero=new BigInteger("0");
	    BigInteger sum=new BigInteger("0");
	    BigInteger rem,rem1,i,j;
	    int k=0;
	    for(i=b;i.compareTo(br)<=0;i=i.add(BigInteger.ONE))
	    {
	    	 j=i;
	    	 k=0;
	    	 rem=j.mod(ten);
	    	 j=j.divide(ten);
	    	 int res=j.compareTo(zero);
	    	 if(res!=0)
	    	 {
	    		 while(res!=0)
	    		 {
	    			 rem1=j.mod(ten);
	    			 j=j.divide(ten);
	    			 res=j.compareTo(zero);
	    			 if(res==0)
	    			 {
	    			    if(rem.equals(rem1))
	    			    {
	    			    	k++;
	    			    	sum=sum.add(ten.pow(k).multiply(rem));
	    			    }
	    			    else
	    			    {
	    			     sum=sum.add(ten.pow(k).multiply(rem));
	    			    	k++;
	    			    	sum=sum.add(ten.pow(k).multiply(rem1));
	    			    }
	    			   break; 
	    			 }
	    			 else
	    			 {
	    				 if(rem.equals(rem1))
	    				 {
	    					 
	    				 }
	    				 else
	    				 {
	    			     sum=sum.add(ten.pow(k).multiply(rem));
	    			       rem=rem1;
	    			      }
	    		   }
	    			 k++;
	    		 }
	    		 
	    	 }
	    	 else
	    	 {
	    		 sum=sum.add(rem);
	    	 } 
	    }
	    
	   System.out.println(sum);
	   t--;
		}
	}

}
