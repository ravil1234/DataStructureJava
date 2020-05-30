package GeeksforGeeks;
import java.util.*;
public class mergesorted {
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t!=0)
	    {
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        mergesorted mo=new mergesorted();
	        heap h=mo.new heap();
	        for(int j=0;j<m;j++)
	        {
	           int b=sc.nextInt();
	            h.addheap(b);
	        }
	        for(int i=0;i<n;i++)
	        {
	        	if(h.data.get(0)<=a[i])
	        	{
	        		int temp=h.data.get(0);
	        		h.data.set(0,a[i]);
	        		a[i]=temp;
	        		h.downheapify(0);
	        	}
	        }
	        for(int i=0;i<n;i++)
	        {
	        	System.out.print(a[i]+" ");
	        }
	        //System.out.println(h.data);
	        int j=0;
	        while(j<m)
	        {
	        	System.out.print(h.remove()+" ");
	        	j++;
	        }
	        System.out.println();
	        t--;
	    }
	}
	public class heap
	{
	   ArrayList<Integer> data=new ArrayList<>();	
	   heap()
	   {
		 this.data=new ArrayList<>();  
	   }
	   public void addheap(int item)
	   {
		   data.add(item);
		   upheapify(data.size()-1);
	   }
	   public void upheapify(int ci)
	   {
		   int pi=(ci-1)/2;
		   if(data.get(ci)<data.get(pi))
		   {
			   swap(ci,pi);
			   upheapify(pi);
		   }
	   }
	   public int  remove()
		{
			swap(0,this.data.size()-1);
			int rv=this.data.remove(this.data.size()-1);
			downheapify(0);
			return rv;
		}
	   public void downheapify(int pi)
		{
			int lci=2*pi+1;
			int rci=2*pi+2;
			int mini=pi;
			if(lci<this.data.size()&& data.get(lci)<data.get(mini))
			{
				mini=lci;
			}
			if(rci<this.data.size()&&data.get(rci)<data.get(mini))
			{
				mini=rci;
			}
			if(mini!=pi)
			{
				swap(pi,mini);
				downheapify(mini);
			}
		}
	   
	   public void swap(int ci,int pi)
	   {
		   int i= data.get(ci);
		   int j=data.get(pi);
		   data.set(ci,j);
		   data.set(pi,i);
	   }
	}
}

