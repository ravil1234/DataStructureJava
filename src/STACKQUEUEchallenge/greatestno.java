package STACKQUEUEchallenge;
import java.util.*;
public class greatestno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        	b[i]=Integer.MIN_VALUE;
        }
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
        	k=i-1;
        	while(!s.isEmpty()&&a[i]>s.peek())
        	{
        		s.pop();
        		b[k]=a[i];
        		k--;
        	}
        	s.push(a[i]);
        }
        while(!s.isEmpty())
        {
        	int count=0;
        	int g=s.pop();
        	for(int i=0;i<n;i++)
        	{
        		if(g==a[i])
        		{
        			for(int j=i;j<n;j++)
        			{
        				if(j==n-1)
        				{
        					j=0;
        				}
        				if(g<a[j])
        				{
        					b[i]=a[j];
        					break;
        				}
        				else
        				{
        					count++;
        					b[i]=-1;
        					if(count==n-1)
        					{
        						break;
        					}
        				}
        			}
        			break;
        		}
        	}
        	
        }
        for(int i=0;i<n;i++)
        {
        	System.out.print(b[i]+" ");
        }
	}

}
