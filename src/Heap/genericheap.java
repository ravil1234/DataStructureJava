package Heap;
import java.util.ArrayList;
import java.util.*;
public class genericheap<T extends Comparable<T>> {
	ArrayList<T> data=new ArrayList<>();
	HashMap<T,Integer> map=new HashMap<>();
	public int size()
	{
		return this.data.size();
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	
	/*  addition in heap o(log n) */
	public void add(T item)
	{
	  data.add(item);
	  map.put(item,this.data.size()-1);
	   upheapify(data.size()-1);
	}
	
	private void upheapify(int ci)
	{
		int pi=(ci-1)/2;
		if(islarger(data.get(ci),data.get(pi))>0)
		{
			swap(ci,pi);
			upheapify(pi);
		}
	}
	private void swap(int ci,int pi)
	{
		T ith=data.get(ci);
		T jth=data.get(pi);
		data.set(ci,jth);
		data.set(pi,ith);
		
		map.put(jth,ci);
		map.put(ith,pi);
		
	}
	/*  removal  in heap o(log n) */
	public T remove()
	{
		swap(0,this.data.size()-1);
		T rv=this.data.remove(this.data.size()-1);
		downheapify(0);
		map.remove(rv);
		return rv;
	}
	private void downheapify(int pi)
	{
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mini=pi;
		if(lci<this.data.size()&& islarger(data.get(lci),data.get(mini))>0)
		{
			mini=lci;
		}
		if(rci<this.data.size()&& islarger(data.get(rci),data.get(mini))>0)
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
	
	public T get()
	{
		return this.data.get(0);
	}
	public void display()
	{
		System.out.println(data);
	}
	/* if priority of t is greater then it returns +ve value*/
	
	private int islarger(T t,T o)
	{
		return t.compareTo(o);
	}
	public void  updatepriority(T pair)
	{
		int index=map.get(pair);
		upheapify(index);
	}
	public static void main(String args[])
	{
		CAR[] c=new CAR[5];
		c[0]=new CAR(100,10000,"RED");
		c[1]=new CAR(700,20000,"BLUE");
		c[2]=new CAR(600,50000,"BLACK");
		c[3]=new CAR(200,30000,"YELLOW");
		c[4]=new CAR(500,70000,"GREEN");
		genericheap<CAR> h=new genericheap<>();
		h.add(c[0]);
		h.add(c[1]);
		h.add(c[2]);
		h.add(c[3]);
		h.display();
		System.out.println(h.remove());
		h.display();
		
		
	}
}
