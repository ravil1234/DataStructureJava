package Heap;
import java.util.*;
public class sliding_window {

	static ArrayList<Integer> data=new ArrayList<>();
	public static int size()
	{
		return data.size();
	}
	public static boolean isEmpty()
	{
		return size()==0;
	}
	public void  addel(int item)
	{
		data.add(item);
		upheapify(data.size()-1);
	}
	public void upheapify(int ci)
	{
		int pi=(ci-1)/2;
		if(data.get(ci)>data.get(pi))
		{
			swap(ci,pi);
			upheapify(pi);
		}
	}
	public int get()
	{
		return data.get(0);
	}
	private void swap(int ci,int pi)
	{
		int ith=data.get(ci);
		int jth=data.get(pi);
		data.set(ci,jth);
		data.set(pi, ith);
	}
	public  void downheapify(int pi)
	{
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mini=pi;
		if(lci<data.size()&& data.get(lci)>data.get(mini))
		{
			mini=lci;
		}
		if(rci<data.size()&&data.get(rci)>data.get(mini))
		{
			mini=rci;
		}
		if(mini!=pi)
		{
			swap(pi,mini);
			downheapify(mini);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sliding_window sd=new sliding_window();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
        for(int i=0;i<k;i++)
        {
        	sd.addel(a[i]);
        }
        System.out.print(sd.get()+" ");
        int g=0;
        for(int i=k;i<n;i++)
        {
            int l=a[g];
            int h= data.indexOf(l);
            data.set(h,a[i]);
            	sd. downheapify(0);
            	sd.upheapify(data.size()-1);
          //  System.out.println(data);
           System.out.print(sd.get()+" ");
           g++;
        }
	}

}
