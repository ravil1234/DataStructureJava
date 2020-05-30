package aug_PRACTICE;
import java.util.*;
public class upper_lowerbound {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    }
    int t=sc.nextInt();
    while(t!=0)
    {
    	int x=sc.nextInt();
    	int count=0;
    	for(int i=0;i<n;i++)
    	{
    		if(a[i]==x&&count==0)
    		{
    			count=1;
    			System.out.print(i);
    		}
    		if(i+1<n)
    		{
    		if(a[i]==x&&a[i+1]!=x)
    		{
    			System.out.println(" "+i);
    			break;
    		}
          }
    		else
    		{
    			if(a[i]==x)
    			{
    				System.out.println(" "+i);
    			}
    		}
      }
    	if(count==0)
    		System.out.println(-1+" "+-1);
    	t--;
    }
  }
}
