package recursionchallenges;
import java.util.*;
public class tilling {
	public static void main(String[] args) {
		System.out.println("enter ");
		Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int count=0;
            while(t!=0)
            {
            	int n=sc.nextInt();
        		int m=sc.nextInt();
        		System.out.print(tile(0,n,m,0));
            }
	t--;
	}
	public static int tile(int cr,int n,int m,int count)
	{
		if(cr==m)
		{
			return count;
		}
		//tile(cr+1,n,m,count);
		for(int i=0;i<n;i++)
		{
			count=count+1;
		}
		return tile(cr+1,n,m,count);
	}
}
