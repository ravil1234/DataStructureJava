package DAILYCODE;
import java.util.*;
public class linearcongruence {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    long  a[]=new long[k];
    long r[]=new long[k];
    for(int i=0;i<k;i++)
    {
    	 a[i]=sc.nextInt();
    }
    for(int i=0;i<k;i++)
    {
    	 r[i]=sc.nextInt();
    }
    int g=1;
    int count=0;
    while(true)
    {
    	count=0;
    	for(int i=0;i<k;i++)
    	{
    		long s=g%a[i];
    		if(s!=r[i])
    		{
    			count=1;
    			break;
    		}
    	}
    	if(count==0)
    	{
    		break;
    	}
    	g++;
    }
    System.out.println(g);
}
}
