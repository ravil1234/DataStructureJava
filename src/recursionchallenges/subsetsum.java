package recursionchallenges;
import java.util.*;
public class subsetsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int c=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int sum=a[i];
				for(int j=i+1;j<n;j++)
				{
					sum=sum+a[j];
					if(sum==0)
					{
						c=1;
						System.out.println("Yes");
						break;
					}
				}
				if(c==1)
				{
					break;
				}
			}
			if(c==0)
			{
				System.out.println("No");
			}
			t--;
		}

	}
	// using hashmap and prefix sum;
	/*
	 Example :

arr[] = {1, 4, -2, -2, 5, -4, 3}

If we consider all prefix sums, we can
notice that there is a subarray with 0
sum when :
1) Either a prefix sum repeats or
2) Or prefix sum becomes 0.

Prefix sums for above array are:
1, 5, 3, 1, 6, 2, 5

Since prefix sum 1 repeats, we have a subarray
with 0 sum. 
	 */
	public static boolean SubsetSum(int[] set){
        HashMap<Integer,Integer> map = new HashMap<>();

            int sum = 0;
            for (int i = 0; i < set.length; i++) {

                sum += set[i];

                if (set[i] == 0 || sum == 0 || map.get(sum) != null)
                    return true;

                    map.put(sum, i);
            }

            return false;
    }

}
