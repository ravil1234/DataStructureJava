package DynamicProgramming;
import java.util.*;
public class boardpath {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int stg[]=new int[m+1];
		long start=System.currentTimeMillis();
		System.out.println(board(0,m,stg));
		//System.out.println(System.currentTimeMillis()-start);
		//System.out.println(count);
		System.out.println(boarditerative(0,m));
	}
public static int board(int curr,int end,int stg[])
{
	if(curr==end)
	{
		return 1;
	}
	if(curr>end)
		return 0;
	if(stg[curr]!=0)
	{
		return stg[curr];
	}
	int c=0;
	for(int i=1;i<=6;i++)
	{
		c+=board(curr+i,end,stg);
	}
	stg[curr]=c;
    return c;	
}
public static int boarditerative(int curr,int end)
{
	int stg[]=new int[end+1];
	stg[end]=1;
	for(int j=end-1;j>=0;j--)
	{
		int c=0;
	for(int i=1;i<=6&&(i+j)<stg.length;i++)
	{
	        c+=stg[i+j];	
	}
	stg[j]=c;
	}
return stg[0];	
}
}
