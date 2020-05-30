package backtracking;
import java.util.ArrayList;
import java.util.List;

public class combination_sum2 {
	static List<List<Integer>> res=new ArrayList<>();
	
	public List<List<Integer>> cs(int[] candidates,int target)
	{
		ArrayList<Integer> ans=new ArrayList<>();
		take(candidates,0,target,ans);
		return res;
		
		
	}
	public void take(int[] arr,int index,int target, ArrayList<Integer> ans)
	{
		if(target<0) 
		{
			return;
		}
		if(target==0)
		{
			ArrayList<Integer> result=new ArrayList<>();
			for(int i=0;i<ans.size();i++)
				result.add(ans.get(i));
			res.add(result);
			
			return;
		}
		if(index>arr.length-1)
			return;
		
	 ans.add(arr[index]);
	 System.out.println("ans-> "+ans);
	take(arr, index+1, target-arr[index], ans);
	ans.remove(ans.size()-1);
	take(arr, index+1, target, ans);
	}
	

}