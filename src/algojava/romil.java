package algojava;
import java.util.*;
public class romil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0)
      {
    	  int n=sc.nextInt();
    	  double sumall=0;
    	  HashMap<String,Double> h=new HashMap<>();
    	  while(n!=0)
    	  {
    		  String s=sc.next();
    		  if(h.containsKey(s))
    		  {
    			  double su=h.get(s)/2;
    			  sumall+=su;
    			  n--;
    			  continue;
    		  }
    		  char ch1=s.charAt(0);
    		  double sum=.2;
    		  for(int i=1;i<s.length();i++)
    		  {
    			  char ch=s.charAt(i);
    			  if(ch=='d'||ch=='f')
    			  {
    				  if(ch1=='d'||ch1=='f')
    					  sum+=.4;
    				  else
    					  sum+=.2;
    			  }
    			  else
    			  {
    				  if(ch1=='j'||ch1=='k')
    					  sum+=.4;
    				  else
    					  sum+=.2;
    			  }
    			  ch1=ch;
    		  }
    		  sumall+=sum;
    		  h.put(s,sum);
    		  n--;
    	  }
    	  int d=(int)(sumall*10);
    	  System.out.println(d);
    	  t--;
      }
	}
}
