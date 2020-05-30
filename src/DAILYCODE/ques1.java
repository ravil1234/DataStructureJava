package DAILYCODE;
import java.util.*;
public class ques1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		  {
			int n=sc.nextInt();
			long i=1;
		    while(true)
		     {
		    	 int c=0;
		    	 long s=n*i;
		    	 long m=s;
		    	 while(s!=0)
		    	 {
		    		 int r=(int)s%10;
                       if(r==1||r==0)
                           s=s/10;
                       else
                       {
                    	   c=1;
                    	   break;
                       }
		    	 }
		         if(c==1)
		             i++;
		         else
		         {
		        	 System.out.println(m);
		         break;
		         }
		     }
		     t--;
		}

	}

}
