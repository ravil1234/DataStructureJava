package Heap;
import java.util.*;
public class MERGEK_SORTED {

		ArrayList<Integer> data=new ArrayList<>();
		public int size()
		{
			return this.data.size();
		}
		public boolean isempty()
		{
			return this.size()==0;
		}
		
		/*  addition in heap o(log n) */
		public void add(int item)
		{
		  data.add(item);
		   upheapify(data.size()-1);
		}
		
		private void upheapify(int ci)
		{
			int pi=(ci-1)/2;
			if(data.get(ci)<data.get(pi))
			{
				swap(ci,pi);
				upheapify(pi);
			}
		}
		private void swap(int ci,int pi)
		{
			int ith=data.get(ci);
			int jth=data.get(pi);
			data.set(ci,jth);
			data.set(pi,ith);
			
		}
		/*  removal  in heap o(log n) */
		public int  remove()
		{
			swap(0,this.data.size()-1);
			int rv=this.data.remove(this.data.size()-1);
			downheapify(0);
			return rv;
		}
		private void downheapify(int pi)
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
		/*  get  priority value  in heap o(1) */
		
		public int get()
		{
			return this.data.get(0);
		}
		public void display()
		{
			System.out.println(data);
		}
		public static void main(String args[])
		{
			MERGEK_SORTED h=new MERGEK_SORTED();
			Scanner sc=new Scanner(System.in);
			int k=sc.nextInt();
			int n=sc.nextInt();
			while(k!=0)
			{
			for(int i=0;i<n;i++)
			{
				int x=sc.nextInt();
			   h.add(x);	
			}
			k--;
			}
		    int l=h.size();
		    for(int i=0;i<l;i++)
		    {
		    	System.out.print(h.remove()+" ");
		    }
		}

}
