import java.util.*;
public class social_network {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n+2];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<n+2;i++)
		{
			a[i]=i;
		}
		
		int g=0;
	for(int i=2;i<n+2;i++)
	{
		int c=0;
		if(a[i]==0)
			continue;
       for( int j=i;j<n+2;j++)
       {
    	  if(j%i==0)
    	  {
    		  if(a[j]==0)
    		  {
    			  c=1;
    		  }
    		  a[j]=0;  
    	  }
         }
       if(c==0)
       {
    	 // System.out.println(i);
    	   g++;
       }
	}
	
	System.out.println(g);
	}
}
