package DAILYCODE;
import java.util.*;
public class task_schedule {
	public class pair
	{
		int start;
		int end;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
		      pair p[]=new pair[n];
			for(int i=0;i<n;i++)
			{
				p[i].start=sc.nextInt();
				p[i].end=sc.nextInt();
			}
			//Arrays.sort(p);
			//System.out.println(p);
	     t--;
		}
	}
}
