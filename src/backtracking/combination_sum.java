package backtracking;
import java.util.*;
public class combination_sum 
{
   static ArrayList<ArrayList<Integer>> res=new ArrayList<>();
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		int a[]= {2,3,4,5};
		int target=23;
		sum(a,target,0,list);
		System.out.println(res);
	}
public  static void sum(int a[],int target,int index,ArrayList<Integer> list)
{
	
	if(target<0)
		return;
    if(target==0)
    {
    	ArrayList<Integer> result=new ArrayList<>();
    	for(int i=0;i<list.size();i++)
    	{
    	result.add(list.get(i));
    	}
    	list=new ArrayList<>();
    	if(result.size()==4)
    		System.out.println(result);
    	res.add(result);
    	return;
    }
    for(int i=index;i<a.length;i++)
    {
    	if(i>index&&a[i]==a[i-1])
    		continue;
    	list.add(a[i]);
    	System.out.println(list+" -> "+index);
    	sum(a,target-a[i],index+1,list);
    	list.remove(list.size()-1);
    }
  }
}
