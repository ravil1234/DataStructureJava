package aug_challenge;
import java.util.*;
public class chef_card {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t!=0)
         {
         String s=sc.next();
         char a[]=new char[s.length()];
         for(int i=0;i<s.length();i++)
         {
        	 a[i]=s.charAt(i);
         }
         for(int i=0;i<a.length;i++)
         {
        	 if(i==0)
        	 {
        		 if(a[i]=='1')
        		 {
        			 a[i]=' ';
        			 if(a[i+1]=='0')
        				 a[i+1]='1';
        			 else
        			 {
        				 if(a[i+1]=='1')
        				    a[i+1]='0';
        			 }
        		 }
        	 }
        	 else if(i==a.length-1)
        	 {
        		 if(a[i]=='1')
        		 {
        			 a[i]=' ';
        			 if(a[i-1]=='0')
        				 a[i-1]='1';
        			 else
        			 {
        				 if(a[i-1]=='1')
        					 a[i-1]='0';
        			 }
        		 } 
        		 for(int j=0;j<a.length;j++)
        		 {
        			 if(a[j]=='1')
        			 {
        				 i=-1;
        				 break;
        			 }
        		 }
        	 }
        	 else
        	 {
        		 if(a[i]=='1')
        		 {
        			 a[i]=' ';
        			 if(a[i-1]=='0')
        				 a[i-1]='1';
        			 else
        			 {
        				 if(a[i-1]=='1')
        				     a[i-1]='0';
        			 }
        			 if(a[i+1]=='1')
        				 a[i+1]='0';
        			 else
        			 {
        				 if(a[i+1]=='0')
        				 a[i+1]='1';
        			 }
        		 }
        	 }
        	 
         }
         int c=0;
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i]=='0')
        	 {
        		 c=1;
        		 System.out.println("LOSE");
        		 break;
        	 }
         }
         if(c==0)
         {
        	 System.out.println("WIN");
         }
         t--;
	  }
	}
}
